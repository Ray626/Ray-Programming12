package com.ray.dBP;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.sql.SQLSyntaxErrorException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        DatabaseHandler databaseHandler = new DatabaseHandler();
        String directory;
        File dir;
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        try {
            System.out.println("Enter the directory name: ");
            directory = scanner.nextLine();
            System.out.println("Enter the directory absolute path");
            String abspath = scanner.nextLine();
            dir = new File(abspath);
            List<File> files = (List<File>) FileUtils.listFiles(dir, TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);

            if (!databaseHandler.checkTableExistence(directory)) {
                if(databaseHandler.createTable(directory)){
                    for (File file : files) {
                        Path path = Paths.get(file.getAbsolutePath());

                        String size = Files.size(path) + " bytes";
                        String ex = "INSERT INTO " + directory + " (filename, path, extension, filesize) VALUES (" +
                                "'" + file.getName() + "'," +
                                "'" + file.getAbsolutePath() + "'," +
                                "'" + FilenameUtils.getExtension(file.getName()) + "'," +
                                "'" + size + "'" +
                                ")";
                        if(!databaseHandler.execAction(ex)){
                            System.out.println("directory name is invalid (first letter of the directory name can neither be number nor symbol)");
                            check = false;
                            break;

                        }
                    }
                }else {
                    System.out.println("directory name is invalid (first letter of the directory name can neither be number nor symbol)");
                    check = false;
                }
            }
            if (check){
                String qu = "SELECT * FROM " + directory;
                ResultSet rs = databaseHandler.execQuery(qu);
                while (rs.next()) {
                    System.out.println("");
                    System.out.print(rs.getString("filename") + " | ");
                    System.out.print(rs.getString("path") + " | ");
                    System.out.print(rs.getString("extension") + " | ");
                    System.out.print(rs.getString("filesize"));
                }
            }

        }catch (UncheckedIOException e){
            System.out.println("Absolute path is invalid");
        } catch (IOException e) {
            System.out.println("Absolute path is invalid");
        }
    }
}

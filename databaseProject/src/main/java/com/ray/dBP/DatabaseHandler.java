package com.ray.dBP;

import java.io.UncheckedIOException;
import java.sql.*;
import java.util.Locale;

public class DatabaseHandler {
    private String dB_URL = "jdbc:derby:database/forum;create=true";
    private String quit_url = "jdbc:derby:database/forum;shutdown=true";
    private Connection conn = null;
    private Statement stmt = null;

    public DatabaseHandler() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        createConnection();
    }


   public void createConnection() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        conn = DriverManager.getConnection(dB_URL);
    }

    public boolean execAction(String qu){
        try{
            stmt = conn.createStatement();
            stmt.execute(qu);
            return true;
        }catch (Exception e){

            return false;
        }
    }
    public boolean createTable(String tableName) throws SQLException {

        String exTable = "CREATE TABLE " + tableName + "(" +
                "ID INT NOT NULL  GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)," +
                "FILENAME VARCHAR(500)," +
                " PATH VARCHAR(500)," +
                " EXTENSION VARCHAR(500)," +
                "FILESIZE VARCHAR(500))";
        if(execAction(exTable)){
            return true;
        }else{
            return false;
        }


    }
    public boolean checkTableExistence(String tableName) throws SQLException {
        DatabaseMetaData metaData = conn.getMetaData();
        ResultSet resultSet = metaData.getTables(null,null,tableName.toUpperCase(Locale.ROOT),null);
        if(resultSet.next()){
            return true;
        }else{
            return false;
        }
    }
    public void quit(){
        try{
            DriverManager.getConnection(quit_url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getErrorCode());
            System.out.println(e.getSQLState());
        }
    }
    public ResultSet execQuery(String qu){
        try{
            stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery(qu);
            return resultSet;
        }catch (Exception e){
            return null;
        }
    }









}

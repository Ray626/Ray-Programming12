import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("words_alpha.txt");
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> words = new ArrayList<>();
        String line;
        while((line = br.readLine())!= null){
            words.add(line);
        }
        for (int i = 0; i < 26; i++){
            CaesarCipher sentenceOne = new CaesarCipher("jgnnq",i);
            if (words.contains(sentenceOne.decryptWord())){
                System.out.println(sentenceOne.decryptWord());
            }
        }
    }
}

import java.io.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("words_alpha.txt");
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> words = new ArrayList<>();
        String line;
        while((line = br.readLine())!= null){
            words.add(line);
        }
        String[] sentence = "ifmmp xpsme j bn b spcpu".split(" ");
        for (int i = 0; i < 26; i++){
            int num = 0;
            StringBuilder finalString = new StringBuilder();
            for (int i1 = 0; i1 < sentence.length; i1++){
                CaesarCipher sentenceOne = new CaesarCipher(sentence[i1],i);
                if (words.contains(sentenceOne.decryptWord())) {
                    num++;
                    finalString.append(sentenceOne.decryptWord()).append(" ");
                }
                if (num == sentence.length){
                    System.out.println(finalString);
                }
            }
        }
    }
}

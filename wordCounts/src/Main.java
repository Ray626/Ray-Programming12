import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("illiad.txt");
        BufferedReader br = new BufferedReader(fr);
        HashSet<String> wordSet = new HashSet<>();
        String line;
        int num = 0;
        while ((line = br.readLine())!= null){
            String[] words = line.split("\\W+");
            for (String word : words) {
                if (wordSet.add(word.toLowerCase(Locale.ROOT))) {
                    num += 1;
                }
            }
        }
        br.close();
        for(String word : wordSet){
            System.out.println(word);
        }
        System.out.println(num);












    }
}

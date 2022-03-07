import com.sun.source.tree.WhileLoopTree;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("illiad.txt");
        BufferedReader br = new BufferedReader(fr);
        HashSet<String> wordSet = new HashSet<>();
        ArrayList<wordCount> wordCounts = new ArrayList<>();
        String line;
        while ((line = br.readLine())!= null){
            String[] word = line.replaceAll("\\p{Punct}","").split("\\s");
            for (int i = 0; i < word.length; i++){
                if(wordSet.add(word[i].toLowerCase(Locale.ROOT))){
                    wordCounts.add(new wordCount(word[i].toLowerCase(Locale.ROOT)));
                }else{
                    for(int index = 0; index < wordCounts.size(); index++){
                        if(wordCounts.get(index).getTheWord().equals(word[i].toLowerCase(Locale.ROOT))){
                            wordCounts.get(index).addOne();
                        }
                    }
                }
            }
        }
        br.close();
        for(int i = 0; i < wordCounts.size(); i++){
            System.out.println(wordCounts.get(i).getTheWord() +" "+ wordCounts.get(i).getCount());
        }












    }
}

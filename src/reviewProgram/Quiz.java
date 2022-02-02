package reviewProgram;

import java.io.*;
import java.util.ArrayList;

public class Quiz {
    private FileReader fr;
    private BufferedReader br;
    private ArrayList<String> questionBank;
    private int questionAmounts;

    public Quiz(int questionAmounts) {
        this.questionAmounts = questionAmounts;
        this.questionBank = new ArrayList<>();
    }
    public Boolean check(){
        return questionBank.size() >= questionAmounts;
    }
    public void read() throws IOException {
        fr = new FileReader("Question.txt");
        br = new BufferedReader(fr);


    }

}

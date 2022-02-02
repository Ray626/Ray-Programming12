package reviewProgram;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Quiz {
    private FileReader fr;
    private BufferedWriter br;
    private ArrayList<String> questionBank;
    private int questionAmounts;

    public Quiz(int questionAmounts) {
        this.questionAmounts = questionAmounts;
        this.questionBank = new ArrayList<>();
    }
    public Boolean check(){
        return questionBank.size() >= questionAmounts;
    }
    public void read() throws FileNotFoundException {
        fr = new FileReader("Question.txt");
    }

}

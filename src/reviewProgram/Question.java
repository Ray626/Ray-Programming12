package reviewProgram;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Question {
    private String question;
    private String answer;
    private FileWriter fw;
    private BufferedWriter bw;


    public Question(String question, String answer) throws IOException {
        this.question = question;
        this.answer = answer;
        fw = new FileWriter("Questions.txt",true);
        bw = new BufferedWriter(fw);

    }

    public void toBank() throws IOException {

        bw.write(question + "&" + answer + "\n");
        bw.close();
    }

}

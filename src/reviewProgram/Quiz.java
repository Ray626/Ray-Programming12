package reviewProgram;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private FileReader fr;
    private BufferedReader br;
    private ArrayList<String[]> questionBank;

    private int questionAmounts;

    public Quiz(int questionAmounts) throws FileNotFoundException {
        this.questionAmounts = questionAmounts;
        this.questionBank = new ArrayList<>();
        fr = new FileReader("Questions.txt");
        br = new BufferedReader(fr);
    }

    /**
     * This method checks the amounts of question that user what to answer is in the correct range
     */
    public Boolean check(){

        try {
            return (questionBank.size() >= questionAmounts);
        }
        catch(Exception e) {
            return false;
        }
    }
    /**
     * Get the amounts of question in bank
     */
    public int bankCheck() throws IOException {
        read();
        return questionBank.size();
    }
    /**
     * This method reads the "Questions.txt" and stores the questions
     * with answers into the 2D arraylist
     */
    public void read() throws IOException {
        String line;
        while ((line = br.readLine())!=null){
            String[] fromBank = line.split("&");
            questionBank.add(fromBank);
        }
        br.close();
    }
    /**
     * This method runs the quiz
     */
    public void start() throws IOException, InterruptedException {
        read();

        if (check()){
            questionAmounts = questionBank.size()-questionAmounts;
            for (int i = 0; i <questionAmounts;i++){
                int random = (int)Math.floor(Math.random()*(questionBank.size()-1+1)+0);
                questionBank.remove(random);
            }
            for(int i = 0; i < questionBank.size();i++){
                System.out.println("Question" + (i+1)+ ": "+ questionBank.get(i)[0]);
                System.out.println("Press enter key to show the answer");
                Scanner flip = new Scanner(System.in);
                flip.nextLine();
                System.out.println("Answer: " + questionBank.get(i)[1] + "\n");
                Thread.sleep(2000);
            }
        }else{
            System.out.println("Input amount is invalid");
        }
    }
}

package reviewProgram;


import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    static void addQToBank() throws IOException {
        System.out.println("Enter the question");
        Scanner questionScan = new Scanner(System.in);
        String question = questionScan.nextLine();
        System.out.println("Enter the answer");
        Scanner answerScan = new Scanner(System.in);
        String answer = answerScan.nextLine().toLowerCase(Locale.ROOT);
        Question questionToBank = new Question(question,answer);
        questionToBank.toBank();
    }
    static void startQuiz() throws IOException {
        Quiz bankCheck=  new Quiz(0,"Questions.txt");
        System.out.println("select the amounts of questions you want to be in the quiz"+"\n"+"Currently "
                + bankCheck.bankCheck() + " in the question bank" );
        Scanner questionAmount = new Scanner(System.in);

        while (true) {
            try {
                int amount = Integer.parseInt(questionAmount.nextLine());
                Quiz run = new Quiz(amount,"Questions.txt");
                run.start();
                break;
            } catch (Exception e) {
                System.out.println("Input is invalid, enter again");
                questionAmount = new Scanner(System.in);
            }
        }



    }

    public static void main(String[] args) throws IOException {
        System.out.println("Choosing mode"+ "\n"+"1)Adding Questions to question bank  2)flash card" );
        Scanner mode = new Scanner(System.in);
        String modeC = mode.nextLine();
        while((!modeC.equals("1"))&&(!modeC.equals("2"))){
            System.out.println("Input is invalid");
            mode = new Scanner(System.in);
            modeC = mode.nextLine();
        }
        if (modeC.equals("1")){
            addQToBank();
        }else {
            startQuiz();
        }




    }
}

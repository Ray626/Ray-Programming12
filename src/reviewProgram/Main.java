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

    public static void main(String[] args) throws IOException {
        addQToBank();
    }
}

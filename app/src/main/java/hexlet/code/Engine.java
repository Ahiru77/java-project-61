package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;

    public static void startGame(String description, String[][] quiz) {
        Cli.greet();
        int winCount = 0;

        System.out.println(description);
        while (winCount < ROUNDS) {
            String question = quiz[winCount][0];
            String answer = quiz[winCount][1];
            System.out.println("Question: " + question);
            Scanner userScan = new Scanner(System.in);
            String userInput = userScan.nextLine();
            if (!userInput.equals(answer)) {
                System.out.println("'" + userInput + "' is wrong answer ;(. "
                        + "Correct answer was '" + answer + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                break;
            }
            System.out.println("Correct!");
            winCount++;
        }
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }
}

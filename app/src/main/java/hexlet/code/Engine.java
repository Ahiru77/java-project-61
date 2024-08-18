package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static boolean isRight(Object quest, Object rightInput) {
        System.out.println("Question: " + quest);
        Scanner userScan = new Scanner(System.in);
        String userInput = userScan.nextLine();

        System.out.println("Your Answer: " + userInput);
        String pass = "Correct!";
        String fail = "'" + userInput + "' is wrong answer ;(. Correct answer was '" + rightInput + "'.";
        if (userInput.equals(rightInput.toString())) {
            System.out.println(pass);
            return true;
        } else {
            System.out.println(fail);
            return false;
        }
    }

    public static void isWin(int winCount) {
		int winMax = 3;
        if (winCount == winMax) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        } else {
            System.out.println("Let's try again, " + Cli.getName() + "!");
        }
    }
}

package hexlet.code;
import java.util.Scanner;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class App {
    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """);
        Scanner input = new Scanner(System.in);
        String yourChoice = input.nextLine();
        System.out.println("Your Choice: " + yourChoice);
        switch (yourChoice) {
            case "0" -> System.exit(0);
            case "1" -> Cli.greet();
            case "2" -> Even.play();
            case "3" -> Calc.play();
            case "4" -> GCD.play();
            case "5" -> Progression.play();
            case "6" -> Prime.play();
            default -> System.out.println("Invalid option");
        }
    }
}


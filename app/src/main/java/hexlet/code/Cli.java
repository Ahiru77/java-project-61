package hexlet.code;
import java.util.Scanner;

public class Cli {

    private static String userName;

    public static void greet() {
        Scanner inputName = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        userName = inputName.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
    public static String getName() {
        return userName;
    }
}

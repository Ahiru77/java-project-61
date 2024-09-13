package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    public static void play() {
        final String description = "Find the greatest common divisor of given numbers.";
        String[][] quiz = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            final int number1 = Utils.getRandomInt(1, 100);
            final int number2 = Utils.getRandomInt(1, 100);
            quiz[i][0] = number1 + " " + number2;
            quiz[i][1] = String.valueOf(gcd(number1, number2));
        }
        Engine.startGame(description, quiz);
    }

    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}

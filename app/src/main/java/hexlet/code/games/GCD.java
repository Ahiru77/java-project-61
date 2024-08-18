package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;

public class GCD {

    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }

    public static void play() {
        Cli.greet();

        int winCount = 0;
        int rightInput;
        boolean toNext;
        System.out.println("Find the greatest common divisor of given numbers.");

        while (winCount < 3) {
            var number1 = (int) (Math.random() * 50);
            var number2 = (int) (Math.random() * 50);
            rightInput = gcd(number1, number2);
            var quest = number1 + " " + number2;

            toNext = Engine.isRight(quest, rightInput);
            if (!toNext) {
                break;
            }
            winCount++;
        }
        Engine.isWin(winCount);
    }
}

package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;

public class GCD {

    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }

    public static void play() {
        Cli.greet();
        int num1;
        int num2;
		int randomMax = 50;
		int winMax = 3;
		

        String quest;
        int winCount = 0;
        int rightInput;
        boolean toNext;
        System.out.println("Find the greatest common divisor of given numbers.");

        while (winCount < winMax) {
            num1 = (int) (Math.random() * randomMax);
            num2 = (int) (Math.random() * randomMax);
            rightInput = gcd(num1, num2);
            quest = num1 + " " + num2;

            toNext = Engine.isRight(quest, rightInput);
            if (!toNext) {
                break;
            }
            winCount++;
        }
        Engine.isWin(winCount);
    }
}

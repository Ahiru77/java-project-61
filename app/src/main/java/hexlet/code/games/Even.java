package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;

public class Even {

    public static void play() {
        Cli.greet();
		final int maxCount = 3;

        int winCount = 0;
        Object rightInput;
        boolean toNext;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (winCount < maxCount) {
            final int num = (int) (Math.random() * 50 + 1);
            rightInput = (num % 2 == 0) ? "yes" : "no";
            toNext = Engine.isRight(num, rightInput);
            if (!toNext) {
                break;
            }
            winCount++;
        }
        Engine.isWin(winCount);
    }
}

package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;

public class Prime {

    public static String isPrime(int num) {
        if (num < 2) {
            return "no";
        }
        for (int k = 2; k <= Math.sqrt(num); k++) {
            if (num % k == 0) {
                return "no";
            }
        }
        return "yes";
    }

    public static void play() {
        Cli.greet();
        final int maxCount = 3;
        String quest;
        int winCount = 0;
        String rightInput;
        boolean toNext;

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (winCount < maxCount) {
            final int num = (int) (Math.random() * 150);
            quest = num + "";
            rightInput = isPrime(num);
            toNext = Engine.isRight(quest, rightInput);
            if (!toNext) {
                break;
            }
            winCount++;
        }
        Engine.isWin(winCount);
    }
}

package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;

public class Prime {

    public static void play() {
        Cli.greet();

        int num;

        String quest = "";
        int winCount = 0;
        String rightInput = "yes";
        boolean toNext;
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        while (winCount < 3) {
            num = (int) (Math.random() * 150);
            quest = num + "";

            if (num < 2) {
                rightInput = "no";
            }
            for (int k = 2; k <= Math.sqrt(num); k++) {
                if (num % k == 0) {
                    rightInput = "no";
                    break;
                }
            }

            toNext = Engine.isRight(quest, rightInput);
            if (!toNext) {
                break;
            }
            winCount++;
        }
        Engine.isWin(winCount);
    }
}

package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static void play() {
        final String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] quiz = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            final int num = Utils.getRandomInt(1, 100);
            quiz[i][0] = String.valueOf(num);
            quiz[i][1] = (isPrime(num)) ? "yes" : "no";
        }
        Engine.startGame(description, quiz);
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int k = 2; k <= Math.sqrt(num); k++) {
            if (num % k == 0) {
                return false;
            }
        }
        return true;
    }
}

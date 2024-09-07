package hexlet.code.games;
import hexlet.code.Engine;

public class Prime {

    public static void play() {

        final String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] quiz = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            final int num = (int) (Math.random() * 150);
            quiz[i][0] = String.valueOf(num);
            quiz[i][1] = isPrime(num);
        }
        Engine.startGame(description, quiz);
    }

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
}

package hexlet.code.games;
import hexlet.code.Engine;

public class Even {

    public static void play() {
        final String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[][] quiz = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            final int num = (int) (Math.random() * 50 + 1);
            quiz[i][0] = String.valueOf(num);
            quiz[i][1] = isEven(num);
        }
        Engine.startGame(description, quiz);
    }

    public static String isEven(int num) {
        return (num % 2 == 0) ? "yes" : "no";
    }
}

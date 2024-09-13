package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    public static void play() {
        final String description = "What is the result of the expression?";
        String[][] quiz = new String[Engine.ROUNDS][2];
        final String[] express = new String[]{"-", "+", "*"};
        for (int i = 0; i < Engine.ROUNDS; i++) {
            final int num1 = Utils.getRandomInt(1, 10);
            final int num2 = Utils.getRandomInt(1, 10);
            final String expressRandom = express[Utils.getRandomInt(0, 2)];
            quiz[i][0] = num1 + " " + expressRandom + " " + num2;
            quiz[i][1] = String.valueOf(calc(num1, num2, expressRandom));
        }
        Engine.startGame(description, quiz);
    }

    public static int calc(int num1, int num2, String express) {
        return switch (express) {
            case "-" -> num1 - num2;
            case "+" -> num1 + num2;
            case "*" -> num1 * num2;
            default -> throw new IllegalArgumentException("Invalid operator");
        };
    }
}

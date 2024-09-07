package hexlet.code.games;
import hexlet.code.Engine;

public class Calc {

    public static void play() {
        final String description = "What is the result of the expression?";

        String[][] quiz = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            final int num1 = (int) (Math.random() * 10);
            final int num2 = (int) (Math.random() * 10);
            final int express = (int) (Math.random() * 3);

            switch (express) {
                case 0:
                    quiz[i][0] = num1 + " - " + num2;
                    quiz[i][1] = String.valueOf(num1 - num2);
                    break;
                case 1:
                    quiz[i][0] = num1 + " + " + num2;
                    quiz[i][1] = String.valueOf(num1 + num2);
                    break;
                case 2:
                    quiz[i][0] = num1 + " * " + num2;
                    quiz[i][1] = String.valueOf(num1 * num2);
                    break;
                default:
                    System.out.println("Invalid expression");
            }
            Engine.startGame(description, quiz);
        }
    }
}

package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;

public class Calc {

    public static void play() {
        Cli.greet();
        final int maxCount = 3;
        String quest = "";
        int winCount = 0;
        int rightInput = 0;
        boolean toNext;
        System.out.println("What is the result of the expression?");
        while (winCount < maxCount) {
            final int num1 = (int) (Math.random() * 10);
            final int num2 = (int) (Math.random() * 10);
            final int express = (int) (Math.random() * 3);

            switch (express) {
                case 0:
                    quest = num1 + " - " + num2;
                    rightInput = num1 - num2;
                    break;
                case 1:
                    quest = num1 + " + " + num2;
                    rightInput = num1 + num2;
                    break;
                case 2:
                    quest = num1 + " * " + num2;
                    rightInput = num1 * num2;
                    break;
                default:
                    System.out.println("Invalid expression");
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

package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;

public class Calc {

    public static void play() {
        Cli.greet();

        int num1;
        int num2;
        int express;

        String quest = "";
        int winCount = 0;
        int rightInput = 5;
        boolean toNext;

        System.out.println("What is the result of the expression?");

        while (winCount < 3) {
            num1 = (int) (Math.random() * 10);
            num2 = (int) (Math.random() * 10);
            express = (int) (Math.random() * 3);

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

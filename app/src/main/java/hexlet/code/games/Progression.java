package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;

public class Progression {

    public static void play() {
        Cli.greet();
        int missingIndex;
        var prog = new String[10];
        int startNum;
        int diff;

        String quest;
        int winCount = 0;
        String rightInput;
        boolean toNext;
        System.out.println("What number is missing in the progression?");

        while (winCount < 3) {
            missingIndex = (int) (Math.random() * 10);
            startNum = (int) (Math.random() * 20);
            diff = (int) (Math.random() * 10);
            prog[0] = startNum + " ";

            for (int i = 1; i < prog.length; i++) {
                startNum = startNum + diff;
                prog[i] = startNum + " ";
            }
            rightInput = prog[missingIndex].trim();
            prog[missingIndex] = ".. ";
            quest = String.join("", prog);

            toNext = Engine.isRight(quest, rightInput);
            if (!toNext) {
                break;
            }
            winCount++;
        }
        Engine.isWin(winCount);
    }
}

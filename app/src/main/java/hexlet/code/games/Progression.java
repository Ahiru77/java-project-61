package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;

public class Progression {

    public static void play() {
        Cli.greet();
        var prog = new String[10];
		final int maxCount = 3;
		
        String quest;
        int winCount = 0;
        String rightInput;
        boolean toNext;
        System.out.println("What number is missing in the progression?");

        while (winCount < maxCount) {
            final int missingIndex = (int) (Math.random() * 10);
            int startNum = (int) (Math.random() * 20);
            final int diff = (int) (Math.random() * (11 - 1) + 1);
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

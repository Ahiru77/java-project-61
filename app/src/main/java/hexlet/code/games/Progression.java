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
		int randomMax1 = 10;
		int randomMax2 = 20;
		int winMax = 3;
		
        String quest;
        int winCount = 0;
        String rightInput;
        boolean toNext;
        System.out.println("What number is missing in the progression?");

        while (winCount < winMax) {
            missingIndex = (int) (Math.random() * randomMax1);
            startNum = (int) (Math.random() * randomMax2);
            diff = (int) (Math.random() * randomMax1);
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

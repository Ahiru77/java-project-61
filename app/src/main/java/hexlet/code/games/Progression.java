package hexlet.code.games;
import hexlet.code.Engine;

public class Progression {

    public static void play() {

        final int arrayLength = 10;
        var prog = new String[arrayLength];

        final String description = "What number is missing in the progression?";
        String[][] quiz = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            final int startRandom = (int) (Math.random() * 20);
            final int missingIndex = (int) (Math.random() * 10);
            int startNum = startRandom;
            final int diff = (int) (Math.random() * (11 - 1) + 1);
            prog[0] = startNum + " ";
            for (int n = 1; n < prog.length; n++) {
                startNum = startNum + diff;
                prog[n] = startNum + " ";
            }
            quiz[i][1] = prog[missingIndex].trim();
            prog[missingIndex] = ".. ";
            quiz[i][0] = String.join("", prog);
        }
        Engine.startGame(description, quiz);
    }
}

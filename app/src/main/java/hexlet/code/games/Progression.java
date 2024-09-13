package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    public static void play() {
        final int arrayLength = 10;
        final String description = "What number is missing in the progression?";
        String[][] quiz = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            final int startNum = Utils.getRandomInt(1, 20);
            final int diff = Utils.getRandomInt(1, 10);
            final int missingIndex = Utils.getRandomInt(0, 9);
            var prog = makeProgression(arrayLength, startNum, diff);
            quiz[i][1] = prog[missingIndex].trim();
            prog[missingIndex] = ".. ";
            quiz[i][0] = String.join("", prog);
        }
        Engine.startGame(description, quiz);
    }

    public static String[] makeProgression(int arrayLength, int startNum, int diff) {
        var prog = new String[arrayLength];
        prog[0] = startNum + " ";
        for (int n = 1; n < prog.length; n++) {
            startNum = startNum + diff;
            prog[n] = startNum + " ";
        }
        return prog;
    }
}

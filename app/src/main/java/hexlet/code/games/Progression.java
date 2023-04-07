package hexlet.code.games;

import hexlet.code.Dice;
import hexlet.code.Engine;

public class Progression {
    private static final int MINIMAL_PROGRESSION_LENGTH = 5;
    private static final int MAXIMAL_PROGRESSION_LENGTH = 10;
    private static final int MINIMAL_INCREASE_STEP = 1;
    private static final int MAXIMAL_INCREASE_STEP = 5;

    public static void runGame() {
        String gameRules = "What number is missing in the progression?";

        Engine.start(gameRules, getQuestionAndAnswerArray());
    }

    public static String[][] getQuestionAndAnswerArray() {
        int countOfRounds = Engine.getCountOfRounds();
        String[][] data = new String[Engine.getCountOfRounds()][Engine.getArrayDepth()];

        for (int i = 0; i < countOfRounds; i++) {
            int progressionSize = Dice.getRandomDiceNumber(MINIMAL_PROGRESSION_LENGTH, MAXIMAL_PROGRESSION_LENGTH);
            int increaser = Dice.getRandomDiceNumber(MINIMAL_INCREASE_STEP, MAXIMAL_INCREASE_STEP);
            int startNumber = Dice.getRandomDiceNumber();
            int[] progression = makeProgression(startNumber, increaser, progressionSize);
            String[] strProgression = new String[progression.length];
            for (int y = 0; y < strProgression.length; y++) {
                strProgression[y] = Integer.toString(progression[y]);
            }
            int hideNumber = (int) (Math.random() * progressionSize);
            String hidden = strProgression[hideNumber];
            strProgression[hideNumber] = "..";
            String consequenceString = "";
            for (var act : strProgression) {
                consequenceString += act;
                consequenceString += " ";
            }
            data[i][0] = consequenceString.trim();
            data[i][1] = hidden;
        }
        return data;
    }

    public static int[] makeProgression(int startNumber, int increaser, int progressionSize) {
        int[] progression = new int[progressionSize]; //-- теперь массив инт, а при использовании будет стринг
        for (int x = 0; x < progressionSize; x++) {
                progression[x] = startNumber + (x * increaser);
        }
        return progression;
    }
}

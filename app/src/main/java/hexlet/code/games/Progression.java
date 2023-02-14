package hexlet.code.games;

import hexlet.code.Dice;
import hexlet.code.Engine;

public class Progression {
    public static void runGame() {
        String gameRules = "What number is missing in the progression?";

        Engine.start(gameRules, getQuestionAndAnswerArray());
    }

    public static String[][] getQuestionAndAnswerArray() {
        int countOfRounds = 3;
        int questionPlusAnswer = 2;
        String[][] data = new String[countOfRounds][questionPlusAnswer];

        for (int i = 0; i < countOfRounds; i++) {
            int progressionSize = Dice.getRandomDiceNumber(5, 10);
            int increaser = Dice.getRandomDiceNumber(1, 5);
            int startNumber = Dice.getRandomDiceNumber();
            String[] progression = makeProgression(startNumber, increaser, progressionSize);
            int hideNumber = (int) (Math.random() * progressionSize);
            String hidden = progression[hideNumber];
            progression[hideNumber] = "..";
            String consequenceString = "";
            for (var act : progression) {
                consequenceString += act;
                consequenceString += " ";
            }
            data[i][0] = consequenceString.trim();
            data[i][1] = hidden;
        }
        return data;
    }

    public static String[] makeProgression(int startNumber, int increaser, int progressionSize) {
        String[] progression = new String[progressionSize];
        int temp = startNumber;
        for (int x = 0; x < progressionSize; x++) {
            progression[x] = Integer.toString(temp);
            temp += increaser;
        }
        return progression;
    }
}
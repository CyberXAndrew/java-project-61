package hexlet.code.games;

import hexlet.code.Dice;
import hexlet.code.Engine;

public class Even {
    public static void runGame() {
        String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        int countOfRounds = 3;
        int questionPlusAnswer = 2;
        String[][] data = new String[countOfRounds][questionPlusAnswer];

        for (int i = 0; i < 3; i++) {
            int diceNumber = Dice.getRandomDiceNumber();
            String question = Integer.toString(diceNumber);
            String answer = diceNumber % 2 == 0 ? "yes" : "no";
            data[i][0] = question;
            data[i][1] = answer;
        }

        Engine.start(gameRules, data);
    }
}

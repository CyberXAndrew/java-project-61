package hexlet.code.games;

import hexlet.code.Dice;
import hexlet.code.Engine;

public class Even {
    public static void runGame() {
        String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        int countOfRounds = Engine.getCountOfRounds();
        String[][] data = new String[Engine.getCountOfRounds()][Engine.getArrayDepth()];

        for (int i = 0; i < countOfRounds; i++) {
            int diceNumber = Dice.getRandomDiceNumber();
            String question = Integer.toString(diceNumber);
            String answer = isEven(diceNumber) ? "yes" : "no";
            data[i][0] = question;
            data[i][1] = answer;
        }

        Engine.start(gameRules, data);
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}

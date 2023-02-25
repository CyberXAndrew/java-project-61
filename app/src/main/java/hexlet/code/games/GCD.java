package hexlet.code.games;

import hexlet.code.Dice;
import hexlet.code.Engine;

public class GCD {
    public static void runGame() {
        String gameRules = "Find the greatest common divisor of given numbers.";
        int countOfRounds = Engine.getCountOfRounds();
        String[][] data = new String[Engine.getCountOfRounds()][Engine.getArrayDepth()];

        for (int i = 0; i < countOfRounds; i++) {
            int diceNumber1 = Dice.getRandomDiceNumber();
            int diceNumber2 = Dice.getRandomDiceNumber();
            String question = diceNumber1 + " " + diceNumber2;
            String answer = Integer.toString(findGCD(diceNumber1, diceNumber2));
            data[i][0] = question;
            data[i][1] = answer;
        }

        Engine.start(gameRules, data);
    }

    public static int findGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return findGCD(num2, num1 % num2);
    }
}

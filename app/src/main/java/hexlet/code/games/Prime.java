package hexlet.code.games;

import hexlet.code.Dice;
import hexlet.code.Engine;

public class Prime {
    public static void gamePrime() {
        String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        int countOfRounds = 3;
        int questionPlusAnswer = 2;
        String[][] data = new String[countOfRounds][questionPlusAnswer];

        for (int i = 0; i < countOfRounds; i++) {
            int number = Dice.getRandomDiceNumber();
            data[i][0] = "" + number;
            data[i][1] = isSimple(number) ? "yes" : "no";
        }

        Engine.start(gameRules, data);
    }

    public static boolean isSimple(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

package hexlet.code.games;

import hexlet.code.Dice;
import hexlet.code.Engine;

public class Prime {
    public static void runGame() {
        String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        int countOfRounds = Engine.getCountOfRounds();
        String[][] data = new String[Engine.getCountOfRounds()][Engine.getArrayDepth()];

        for (int i = 0; i < countOfRounds; i++) {
            int number = Dice.getRandomNumber();
            data[i][0] = "" + number;
            data[i][1] = isPrime(number) ? "yes" : "no";
        }

        Engine.start(gameRules, data);
    }

    public static boolean isPrime(int number) {
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

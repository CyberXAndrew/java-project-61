package hexlet.code.games;

import hexlet.code.Dice;
import hexlet.code.Engine;

public class Calc {
    public static void runGame() {
        String gameRules = "What is the result of the expression?";
        int countOfRounds = 3;
        int questionPlusAnswer = 2;
        String[][] data = new String[countOfRounds][questionPlusAnswer];

        for (int i = 0; i < countOfRounds; i++) {
            String operator = getRandomOperator();
            int number1 = Dice.getRandomDiceNumber();
            int number2 = Dice.getRandomDiceNumber();
            data[i][0] = number1 + " " + operator + " " + number2;
            data[i][1] = getStringFormOfAnswer(operator, number1, number2);
        }

        Engine.start(gameRules, data);
    }

    public static String getRandomOperator() {
        String[] operators = {"-", "*", "+"};
        return operators[Dice.getRandomDiceNumber(0, 2)];
    }

    public static String getStringFormOfAnswer(String operator, int number1, int number2) {
        int result = 0;
        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            default:
                break;
        }
        return Integer.toString(result);
    }
}

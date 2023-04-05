package hexlet.code.games;

import hexlet.code.Dice;
import hexlet.code.Engine;

public class Calc {
    private static final String MINUS = "-";
    private static final String PLUS = "+";
    private static final String MULTIPLY = "*";
    public static void runGame() {
        String gameRules = "What is the result of the expression?";
        int countOfRounds = Engine.getCountOfRounds();
        String[][] data = new String[Engine.getCountOfRounds()][Engine.getArrayDepth()];

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
        String[] operators = {MINUS, MULTIPLY, PLUS};
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
                System.out.println("Для оператора " + operator + "не определена логика");
                break;
        }
        return Integer.toString(result);
    }
}

package hexlet.code.games;

import hexlet.code.Dice;
import java.util.Scanner;

public class Calc {
    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("What is the result of the expression?");
        int i = 0;
        for (i = 0; i < 3; i++) {
            int diceNumber1 = Dice.getRandomDiceNumber();
            int diceNumber2 = Dice.getRandomDiceNumber();
            String strSum = diceNumber1 + " + " + diceNumber2;
            String strSubtract = diceNumber1 + " - " + diceNumber2;
            String strMultiply = diceNumber1 + " * " + diceNumber2;
            var sum = diceNumber1 + diceNumber2;
            var subtract = diceNumber1 - diceNumber2;
            var multiply = diceNumber1 * diceNumber2;
            int number = (int) (Math.random() * 3);
            String[] stringExpression = {strSum, strSubtract, strMultiply};
            String strResult = stringExpression[number];
            int[] intExpression = {sum, subtract, multiply};
            int intResult = intExpression[number];
            System.out.println("Question: " + strResult);
            var userAnswer = scanner.nextInt();
            System.out.println("Your answer: " + userAnswer);
            if (userAnswer == intResult) {
                System.out.println("Correct!");
            } else if (userAnswer != intResult) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + intResult + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
        if (i == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}

package hexlet.code.games;

import hexlet.code.Dice;

import java.util.Scanner;
public class GCD {
    public static void divisor() { // метод выдает числа НОД которых чаще всего 1 :(
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Find the greatest common divisor of given numbers.");

        int i = 0;
        for (i = 0; i < 3; i++) {
            int diceNumber1 = Dice.getRandomDiceNumber();
            int diceNumber2 = Dice.getRandomDiceNumber();
            System.out.println("Question: " + diceNumber1 + " " + diceNumber2);
            System.out.print("");
            var userAnswer = scanner.nextInt(); //nextInt()
            var bigger = 0;
            var smaller = 0;
            if (diceNumber1 > diceNumber2) {
                bigger = diceNumber1;
                smaller = diceNumber2;
            } else if (diceNumber2 > diceNumber1) {
                bigger = diceNumber2;
                smaller = diceNumber1;
            }
            if (diceNumber1 == diceNumber2) {
                if (userAnswer == diceNumber1) {
                    System.out.println("Your answer: " + userAnswer);
                    System.out.println("Correct!");
                } else {
                    System.out.println("Your answer: " + userAnswer);
                    System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + diceNumber1 + "'.");
                    System.out.println("Let's try again, " + userName + "!");
                    break;
                }
            }

            var one = bigger;
            var two = smaller;
            while (one % two != 0) {
                var three = one % two;
                one = two;
                two = three;
            }
            if (userAnswer == two) {
                System.out.println("Your answer: " + userAnswer);
                System.out.println("Correct!");
            } else {
                System.out.println("Your answer: " + userAnswer);
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + two + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
        if (i == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}

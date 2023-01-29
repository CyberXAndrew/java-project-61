package hexlet.code.games;

import hexlet.code.Dice;
import java.util.Scanner;

public class Even {
    public static void isParity() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");
        int i = 0;
        for (i = 0; i < 3; i++) {
            int diceNumber = Dice.getRandomDiceNumber();
            System.out.println("Question: " + diceNumber);
            String userAnswer = scanner.next().toLowerCase();
            if (diceNumber % 2 == 0 && userAnswer.equals("yes") || diceNumber % 2 != 0 && userAnswer.equals("no")) {
                System.out.println("Your answer: " + userAnswer);
                System.out.println("Correct!");
            } else if (diceNumber % 2 == 0 && userAnswer.equals("no")) {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            } else {
                if (diceNumber % 2 == 0) {
                    System.out.println(userAnswer + " is wrong answer ;(. Correct answer was 'yes'.");
                    System.out.println("Let's try again, " + userName + "!");
                    break;
                } else {
                    System.out.println(userAnswer + " is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + userName + "!");
                    break;
                }
            }
        }
        if (i == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}

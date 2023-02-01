package hexlet.code.games;

import hexlet.code.Dice;
import java.util.Scanner;

public class Prime {
    public static void isSimple() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int i = 0;
        boolean answer = false;
        for (i = 0; i < 3; i++) {
            int number = Dice.getRandomDiceNumber();
            if (number == 2 || number == 3) {
                answer = true;
            } else if (number % 2 == 0) {
                answer = false;
            } else {
                for (int x = 3; x < 10; x++) {
                    if (number == x && number % x == 0) {
                        answer = true;
                        break;
                    } else if (number % x == 0) {
                        answer = false;
                        break;
                    } else if (number > 9 && x == 9) {
                        answer = true;
                    } else {
                        continue;
                    }
                }
            }

            System.out.println("Question: " + number);
            var userAnswer = scanner.next(); //nextInt()
            if (userAnswer.equals("yes") && answer == true || userAnswer.equals("no") && answer == false) {
                System.out.println("Your answer: " + userAnswer);
                System.out.println("Correct!");
            } else {
                if (userAnswer.equals("no") && answer == true) {
                    System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was 'yes'.");
                    System.out.println("Let's try again, " + userName + "!");
                    break;
                } else {
                    System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                            + yesOrNo(answer) + "'.");
                    System.out.println("Let's try again, " + userName + "!");
                    break;
                }
            }
        }
        if (i == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

    public static String yesOrNo(boolean answer) {
        if (answer == true) {
            return "yes";
        }
        return "no";
    }
}

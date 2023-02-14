
package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void start(String gameRules, String[][] data) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(gameRules);

        for (var act: data) {
            System.out.println("Question: " + act[0]);
            var userAnswer = scanner.next();
            System.out.println("Your answer: " + userAnswer);
            if (userAnswer.equals(act[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + act[1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}


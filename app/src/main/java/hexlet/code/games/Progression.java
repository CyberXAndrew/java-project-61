package hexlet.code.games;

import hexlet.code.Dice;
import java.util.Scanner;

public class Progression {
    public static void progressor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("What number is missing in the progression?");

        int i = 0;
        for (i = 0; i < 3; i++) {
            int progressionSize = (int) (Math.random() * 6 + 5); // (5-10) выдает число из интервала, включительно
            int increaser = (int) (Math.random() * 6 + 1); // 1-6
            int startNumber = Dice.getRandomDiceNumber(); // 1-99
            int hideNumber = (int) (Math.random() * progressionSize); //число от 0 ДО progressionSize
            int[] progression = new int[progressionSize];
            int temp = startNumber;

            for (int x = 0; x < progressionSize; x++) {
                progression[x] = temp;
                temp += increaser;
            }
            System.out.print("Question: ");

            for (int y = 0; y < progressionSize; y++) {
                if (y != hideNumber) {
                    System.out.print(progression[y] + " ");
                } else if (y == hideNumber) {
                    System.out.print(".. ");
                }
            }
            System.out.println("");
            var userAnswer = scanner.nextInt();
            System.out.println("Your answer: " + userAnswer);
            if (userAnswer == progression[hideNumber]) {
                System.out.println("Correct!");
            } else if (userAnswer != progression[hideNumber]) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + progression[hideNumber] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
        if (i == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}

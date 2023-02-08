package hexlet.code.games;

import hexlet.code.Dice;
import hexlet.code.Engine;

public class Progression {
    public static void progressor() {
        String gameRules = "What number is missing in the progression?";

        Engine.start(gameRules, makeProgression());
    }

    public static String[][] makeProgression() {
        int countOfRounds = 3;
        int questionPlusAnswer = 2;
        String[][] data = new String[countOfRounds][questionPlusAnswer];

        for (int i = 0; i < countOfRounds; i++) {
            int progressionSize = Dice.getRandomDiceNumber(5, 10); // 5-10 вкл
            int increaser = Dice.getRandomDiceNumber(1, 5); // увеличитель 1-5 вкл
            int startNumber = Dice.getRandomDiceNumber(); //начальное число
            int hideNumber = (int) (Math.random() * progressionSize); //число от 0 ДО progressionSize
            String[] progression = new String[progressionSize];
            int temp = startNumber;
            for (int x = 0; x < progressionSize; x++) {
                progression[x] = Integer.toString(temp);
                temp += increaser;
            }
            String hidden = progression[hideNumber];
            progression[hideNumber] = "..";
            String consequenceString = "";
            for (var act : progression) {
                consequenceString += act;
                consequenceString += " ";
            }

            data[i][0] = consequenceString;
            data[i][1] = hidden;

        }

        return data;
    }
}

//            System.out.println("");
//            var userAnswer = scanner.nextInt();
//            System.out.println("Your answer: " + userAnswer);
//            if (userAnswer == progression[hideNumber]) {
//                System.out.println("Correct!");
//            } else if (userAnswer != progression[hideNumber]) {
//                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
//                        + progression[hideNumber] + "'.");
//                System.out.println("Let's try again, " + userName + "!");
//                break;
//            }
//        }
//        if (i == 3) {
//            System.out.println("Congratulations, " + userName + "!");
//

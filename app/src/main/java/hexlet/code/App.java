package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n"
                + "4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        Scanner scanner = new Scanner(System.in);
        String userChoise = scanner.next();
        System.out.println("Your choise: " + userChoise);
        switch (userChoise) {
            case "0" -> scanner.close();
            case "1" -> Cli.ask();
            case "2" -> Even.runGame();
            case "3" -> Calc.runGame();
            case "4" -> GCD.runGame();
            case "5" -> Progression.runGame();
            case "6" -> Prime.runGame();
            default -> System.out.println("Unknown command. Bye!");
        }
    }
}

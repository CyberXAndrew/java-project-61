package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        String userChoise = scanner.next();
        if (userChoise.equals("1")) {
            System.out.println("Your choise: 1");
            System.out.println();
            System.out.println("Welcome to the Brain Games!");
            Cli.ask();
        } else if (userChoise.equals("2")) {
            System.out.println("Your choise: 2");
            System.out.println();
            System.out.println("Welcome to the Brain Games!");
            Even.isParity();
        } else if (userChoise.equals("3")) {
            System.out.println("Your choise: 3");
            System.out.println();
            System.out.println("Welcome to the Brain Games!");
            Calc.calculator();
        } else if (userChoise.equals("4")) {
            System.out.println("Your choise: 4");
            System.out.println();
            System.out.println("Welcome to the Brain Games!");
            GCD.divisor();
        } else if (userChoise.equals("5")) {
            System.out.println("Your choise: 5");
            System.out.println();
            System.out.println("Welcome to the Brain Games!");
            Progression.progressor();
        } else if (userChoise.equals("6")) {
            System.out.println("Your choise: 6");
            System.out.println();
            System.out.println("Welcome to the Brain Games!");
            Prime.isSimple();
        } else if (userChoise.equals("0")) {
            System.out.println("Your choise: 0");
            scanner.close();
        }
    }
}

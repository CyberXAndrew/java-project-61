package hexlet.code;

public class Dice {
    public static int getRandomDiceNumber() {
        int preMaximalNumber = 99;
        int integer = (int) (Math.random() * preMaximalNumber + 1);
        return integer;
    }

    public static int getRandomDiceNumber(int min, int max) {
        int integer = (int) (Math.random() * (max - min + 1) + min);
        return integer;
    }
}

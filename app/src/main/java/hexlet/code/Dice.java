package hexlet.code;

public class Dice {
    public static int getRandomDiceNumber() {
        int integer = (int) (Math.random() * 99 + 1);
        return integer;
    }

    public static int getRandomDiceNumber(int min, int max) {
        int integer = (int) (Math.random() * (max - min + 1) + min);
        return integer;
    }
}

package hexlet.code;

public class Dice {
    private static final int PRE_MAXIMAL_NUMBER = 99;

    public static int getRandomDiceNumber() {
        int integer = (int) (Math.random() * PRE_MAXIMAL_NUMBER + 1);
        return integer;
    }

    public static int getRandomDiceNumber(int min, int max) {
        int integer = (int) (Math.random() * (max - min + 1) + min);
        return integer;
    }
}

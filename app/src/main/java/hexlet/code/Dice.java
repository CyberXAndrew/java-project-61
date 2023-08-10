package hexlet.code;

public class Dice {
    private static final int PRE_MAXIMAL_NUMBER = 99;

    public static int getRandomNumber() {
        return (int) (Math.random() * PRE_MAXIMAL_NUMBER + 1);
    }

    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}

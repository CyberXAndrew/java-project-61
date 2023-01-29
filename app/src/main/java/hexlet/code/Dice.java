package hexlet.code;

public class Dice {
    public static int getRandomDiceNumber() {
        int integer = (int) (Math.random() * 99 + 1);
        return integer;
    }
}

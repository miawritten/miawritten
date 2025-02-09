import java.util.Random;


public class DiceRoller {

    DiceRoller() {
        Random random = new Random();
        int number = 0;
        rollDice(random, number);

    }
    void rollDice(Random random, int number) {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }

    public static void main(String[] args) {
        new DiceRoller(); }}

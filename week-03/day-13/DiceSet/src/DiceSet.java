import java.util.Arrays;

public class DiceSet {

    int[] dices = new int[6];

    public int[] roll() {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = (int) (Math.random() * 6) + 1;
        }
        return dices;
    }

    public int[] getCurrent() {
        return dices;
    }

    public int getCurrent(int i) {
        return dices[i];
    }

    public void reroll() {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = (int) (Math.random() * 6) + 1;
        }
    }

    public void reroll(int k) {
        dices[k] = (int) (Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        DiceSet diceSet = new DiceSet();
        diceSet.roll();
        boolean isAllSix;

        do {
            isAllSix = true;
            for (int i = 0; i < diceSet.dices.length; i++) {
                if (diceSet.getCurrent(i) != 6) {
                    diceSet.reroll(i);
                    isAllSix = false;
                }
            }
        } while (!isAllSix);

        for (int i = 0; i < diceSet.dices.length; i++) {
            System.out.println(diceSet.getCurrent(i));
        }
    }
}
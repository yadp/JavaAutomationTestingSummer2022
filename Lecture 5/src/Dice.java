import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    int sides = 6;

    public int throwDice(){
        return ThreadLocalRandom.current().nextInt(1,sides+1);
    }
}

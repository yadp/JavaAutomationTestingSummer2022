package Coin;

import java.util.concurrent.ThreadLocalRandom;

public class Coin {

    public String throwCoin(){
        int rand = ThreadLocalRandom.current().nextInt(1,2+1);
        if (rand == 1){
            return "Heads";
        }
        else {
            return "Tails";
        }
    }
}

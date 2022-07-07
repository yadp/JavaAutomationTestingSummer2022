package Coin;

public class Main {

    public static void main(String[] args) {
        Coin coin = new Coin();

        int heads=0;
        for (int i = 0; i < 50; i++) {
            String oneThrow = coin.throwCoin();
            System.out.println(oneThrow);
            if( oneThrow == "Heads"){
                heads++;
            }
        }
        System.out.println(heads);

    }
}

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberCheck {

    public static void main(String[] args) {
        //int q = 1;
        int q = ThreadLocalRandom.current().nextInt(-100, 100 + 1);

        if (q >= 0) {
            System.out.println("Q is a positive number");
        } else{
            System.out.println("Q is a negative number");
        }

        System.out.println(q);
    }
}

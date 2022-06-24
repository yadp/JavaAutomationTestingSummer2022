import java.util.Scanner;

public class InputNNUmbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;


        System.out.println("How many numbers: ");
        int n = in.nextInt();

        System.out.println("You want to enter " + n + " numbers ");

        for (int i = 0; i < n; i++) {
            System.out.println("PLease enter next number: ");
            sum = sum + in.nextInt();
            System.out.println("Sum is: "+ sum);
        }
    }
}

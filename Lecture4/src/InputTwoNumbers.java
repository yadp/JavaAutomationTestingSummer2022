import java.util.Scanner;

public class InputTwoNumbers {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("First number: ");
        int number1 = in.nextInt();
        System.out.println("Second number: ");
        int number2 = in.nextInt();

        System.out.println("First: "+ number1 + " Second: "+ number2);


    }
}

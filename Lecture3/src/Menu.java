import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputNumber = 1;

        while (inputNumber != 0) {
            //Print our menu
            System.out.println("Please choose an option: \n" +
                    "1) Option 1 \n" +
                    "2) Option 2\n" +
                    "Else - end the program\n");
            inputNumber = in.nextInt();
            switch (inputNumber) {
                case 1:
                    System.out.println("1)");
                    break;
                case 2:
                    System.out.println("2)");
                    break;
                default:
                    inputNumber = 0;
                    System.out.println("Bye!");
            }

        }
        in.close();
    }
}

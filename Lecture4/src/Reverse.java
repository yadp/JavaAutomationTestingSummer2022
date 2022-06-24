import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int storeNumber = num;
        long rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }

        System.out.println(num);
        System.out.println(rev_num);

        if( storeNumber == rev_num){
            System.out.println("Palindrome");
        } else {
            System.out.println("No");
        }

    }
}

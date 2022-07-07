package Rectangle;

import java.util.Scanner;

public class MainWrongRec {

    public static void main(String[] args) {


        Rectangle one = new Rectangle(3,5);

        System.out.println(one.getArea());

        one.a = -2;

        System.out.println(one.getArea());

        Scanner in = new Scanner(System.in);
        one.a = 3;
        one.b = in.nextInt();

        System.out.println(one.getArea());


        RectanglePrivate second = new RectanglePrivate(3,5);

        System.out.println(second.getArea());

        second.setA(-3);

        System.out.println(second.getArea());


    }
}

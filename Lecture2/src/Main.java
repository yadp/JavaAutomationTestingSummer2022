import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        float example =  5.3f;
        double exampleDouble= 5.3;

        /*
        Create a program and try to print all of this components:
        Real number - price for example - 2.57 - price
            Variable that can take true or false values - bool
            Create var. One int with value 3 and one double with value 5.5. What will happen if you add them?
         */
        double a=5.5;
        double b = 3.5;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);



        boolean testBool = true;



        System.out.println(testBool);

        String text = "test";
        System.out.println(text);


        boolean lightsOff = false;

        if(lightsOff){
            System.out.println("Turn on the lights");
        }

        System.out.println("Lights are On!");


        int z = 5;
        int x = 6;

        if( x > z) {
            System.out.println("X is bigger than Z");
        }

        /*
        Create 2 int variables .  Example: 5 and 10
        Check which one is bigger and print it on the Console.
        Try to create a message like this:
        "Number 10 is bigger than 5"

         */

    }
}
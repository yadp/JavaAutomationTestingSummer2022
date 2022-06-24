import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];

        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at index 0: "
                + anArray[0]);
        System.out.println("Element at index 1: "
                + anArray[1]);
        System.out.println("Element at index 2: "
                + anArray[2]);
        System.out.println("Element at index 3: "
                + anArray[3]);
        System.out.println("Element at index 4: "
                + anArray[4]);
        System.out.println("Element at index 5: "
                + anArray[5]);
        System.out.println("Element at index 6: "
                + anArray[6]);
        System.out.println("Element at index 7: "
                + anArray[7]);
        System.out.println("Element at index 8: "
                + anArray[8]);
        System.out.println("Element at index 9: "
                + anArray[9]);


        System.out.println(anArray);

        System.out.println(anArray.length);

        for (int i = 0; i < anArray.length; i++) {
            System.out.println(anArray[i]);
        }

        Scanner in = new Scanner(System.in);

        System.out.println("Get index: ");
        int index = in.nextInt();
        if(index < anArray.length) {

            System.out.println("Number on index " + anArray[index]);
        } else {
            System.out.println("Wrong Index");
        }

        System.out.println("Get number to serach:");
        int searchNum= in.nextInt();

        for (int i = 0; i < anArray.length; i++) {
            if(anArray[i]==searchNum){
                System.out.println("We found it "+ i);
            }
        }
    }
}

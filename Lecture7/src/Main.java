import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] arr = new int[]{1,2,34,5};

        System.out.println(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));

        Dog tea = new Dog("Tea");

        // Example of get and set for dog age

        tea.setAge(2);

        System.out.println("Show Tea years: "+ tea.getAge());

        tea.setAge(-2);

        System.out.println("Show Tea years: "+ tea.getAge());

        tea.setAge(3);

        System.out.println("Show Tea years: "+ tea.getAge());



        //Zoo array example
        Zoo zooExample = new Zoo();

        System.out.println(Arrays.toString(zooExample.getZooDog()));



        zooExample.addDog(tea);

        System.out.println(Arrays.toString(zooExample.getZooDog()));



    }
}
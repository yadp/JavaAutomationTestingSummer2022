package collections.list;


import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        /*
        Create a shopping list of 3 items ( Example: "Bananas", "Bread", "Milk")
        Print all of the items of the list one by one. On separate lines
        Print how many items do we have in the list.
        Add an element to the list - "Milk"
         */

        ArrayList<String> city = new ArrayList<>();

        System.out.println(city);

        city.add("Sofia");
        city.add("Varna");

        System.out.println(city);

        System.out.println("List of city is with size: "+ city.size());

        city.remove("Sofia");

        System.out.println(city);

        System.out.println("List of city is with size: "+ city.size());

        city.remove("Burgas");

        System.out.println(city);

        System.out.println("List of city is with size: "+ city.size());

        System.out.println(city.get(0));

        //list.get() == array[]
        //list.size() == array.length

        city.add("Burgas");
        city.add("Sofia");
        for (int i = 0; i < city.size(); i++) {
            System.out.println(city.get(i));
        }


    }
}

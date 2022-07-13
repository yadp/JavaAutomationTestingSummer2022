package collections.list;

import java.util.ArrayList;

public class DogList {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();

        Dog tea = new Dog("Tea");
        Dog rex = new Dog("Rex");

        dogs.add(tea);
        dogs.add(rex);


        System.out.println(dogs);

        for (int i = 0; i < dogs.size(); i++) {
            System.out.println(dogs.get(i).getName());
        }

        //
    }
}

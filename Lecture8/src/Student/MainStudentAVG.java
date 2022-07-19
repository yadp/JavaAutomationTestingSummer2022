package Student;

import java.util.ArrayList;
import java.util.List;

public class MainStudentAVG {

    public static int findAvgAge(List<Person> persons){
        int sumOfAge=0;
        for (int i = 0; i < persons.size(); i++) {
            sumOfAge += persons.get(i).getAge();
        }

        return sumOfAge/persons.size();
    }

    public static void main(String[] args) {
        List<Person> listOfPersons= new ArrayList<>();

        Person ted = new Teacher("Ted",30);
        Person yavor = new Student("Yavor", 29);
        Person bob = new Student("Bob", 31);


        listOfPersons.add(ted);
        listOfPersons.add(yavor);
        listOfPersons.add(bob);

        System.out.println(listOfPersons);

        System.out.println("Avg age is "+ findAvgAge(listOfPersons));
    }


}

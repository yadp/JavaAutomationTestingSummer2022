import Student.Student;
import Student.Person;
import Student.Teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EightOne {

    //Create method that will find the most used subject in the array.
    //For example if we have this people:
    //Tom - Student - Study Art and Math
    //Ben - Student - Study  Math
    //Jack -  teacher  - Teaches Math
    //Then Math should be the most used

    // Art & Math, Math, Math
    public static void main(String[] args) {
        List<Person> listOfPersons = new ArrayList<>();

        Person ted = new Teacher("Tom", 30, "Math");
        Teacher al = new Teacher("Tom", 30, "Math");
        Person yavor = new Student("Ben", 29, Arrays.asList(new String[]{"Math", "Art"}));
        Person bob = new Student("Jack", 31, Arrays.asList(new String[]{"Math", "Art"}));

        // Example of instance of
        System.out.println("Is he person" + (ted instanceof Person));
        System.out.println("Is he teacher" + (ted instanceof Teacher));
        System.out.println("Is he student" + (ted instanceof Student));

        System.out.println("Is he person" + (al instanceof Person));
        System.out.println("Is he teacher" + (al instanceof Teacher));
        // End Example of instance of

        // Cast
        System.out.println(ted.getAge());
        System.out.println(((Teacher)ted).getLesson());
        System.out.println(((Student)ted).getListLessons());

        // End Cast

        listOfPersons.add(ted);
        listOfPersons.add(yavor);
        listOfPersons.add(bob);

        System.out.println(listOfClasses(listOfPersons));

        System.out.println(mostCommonString(listOfClasses(listOfPersons)));


        List<String> list = new ArrayList<>();
        list.add("Sofia");
        list.add("Varna");
        list.add("Sofia");

        System.out.println(count(list.get(0), list));
    }

    /**
     * List all classes that our students atend
     * and add all of the teachers that teach them.
     *
     * @param listOfPersons List of all of the people in our school
     * @return List of all classes
     */
    private static List<String> listOfClasses(List<Person> listOfPersons) {
        List<String> listToReturn = new ArrayList<>();

        for (int i = 0; i < listOfPersons.size(); i++) {
            if (listOfPersons.get(i) instanceof Teacher) {
                listToReturn.add(((Teacher) listOfPersons.get(i)).getLesson());
            } else {
                listToReturn.addAll(((Student) listOfPersons.get(i)).getListLessons());
            }
        }
        return listToReturn;
    }


    /**
     * Find the most common word in the list
     *
     * @param words list of words
     * @return word with most number of ocurances
     */
    public static String mostCommonString(List<String> words) {
        String mostWord = "";
        int mostCount = 0;
        for (int i = 0; i < words.size(); i++) {
            if (count(words.get(i), words) > mostCount) {
                mostCount = count(words.get(i), words);
                mostWord = words.get(i);
            }
        }
        return mostWord;
    }


    public static int count(String word, List<String> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(word)) {
                count++;
            }
        }
        return count;
    }
}

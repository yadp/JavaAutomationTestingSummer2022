package Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Student extends Person{
    private List<String> listLessons;

    public Student(String name, int age) {
        super(name, age);
        listLessons = new ArrayList<>();
    }


    public List<String> getListLessons() {
        return listLessons;
    }

    public void setListLessons(List<String> listLessons) {
        this.listLessons = listLessons;
    }

}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Student{

    private String name;
    private List<String> lessons;

    public Student(String name){
        this.name = name;
        this.lessons = new LinkedList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getLessons() {
        return lessons;
    }

    public void setLessons(List<String> lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lessons=" + lessons +
                '}';
    }
}

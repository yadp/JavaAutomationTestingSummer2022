package Student;

public class Teacher extends Person{
    private String lesson;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }
}

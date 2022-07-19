public class MainStudent {
    public static void main(String[] args) {
        Student yavor = new Student("Yavor");

        yavor.getLessons().add("Math");
        yavor.getLessons().add("Art");

        System.out.println(yavor.getLessons());
    }
}

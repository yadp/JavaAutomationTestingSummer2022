package inheritance;

public class Main {
    public static void main(String[] args) {
        Dog tea = new Dog();

        tea.setName("Tea");

        System.out.println(tea.move(5));

        System.out.println(tea.bark());
    }
}

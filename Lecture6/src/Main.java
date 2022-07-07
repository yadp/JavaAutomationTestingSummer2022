


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Dog tea = null;
        System.out.println(tea);
        Dog dog = new Dog();
        System.out.println(dog.name);
        System.out.println(dog.age);

        tea = new Dog("Tea");

        System.out.println(tea.name);

    }
}
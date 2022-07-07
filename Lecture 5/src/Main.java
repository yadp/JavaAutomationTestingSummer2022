public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");



        int a = 5;
        Dog tea = new Dog();
        tea.age = 1;
        tea.name = "Tea";
        tea.color = "Brown";

        tea.run();
        System.out.println(tea.bark());

        Dog rex = new Dog();
        rex.age = 2;
        rex.name= "Rex";
        rex.color = "Black";

        rex.run();

        System.out.println("This is "+ tea.name+" , age: "+ tea.age);

    }
}
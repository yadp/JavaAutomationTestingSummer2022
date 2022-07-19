package Animal;

public class MainWolf {
    public static void main(String[] args) {

        Animal wolf1 = new Dog();
        wolf1.move();

        WolfFamily wolf2= new Dog();

        wolf2.move();
        System.out.println(wolf2 instanceof Dog);
        System.out.println(wolf2 instanceof WolfFamily);
        System.out.println(wolf2 instanceof Animal);

        Dog wolf3= new Dog();
        wolf3.move();
    }
}

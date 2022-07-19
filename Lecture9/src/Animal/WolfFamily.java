package Animal;

public abstract class WolfFamily implements Animal{

    public abstract void makeWolfSound();

    @Override
    public void move() {
        System.out.println("Move from abstract class");
    }
}

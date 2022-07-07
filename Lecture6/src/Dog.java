public class Dog {

    String name;
    int age;

    public Dog(){
        System.out.println("Dog Constructor");
        name="Default name";
    }

    public Dog(String name){
        this.name = name;
    }

    public String bark(){
        return "Bark";
    }

    public String running(){
        return "Running";
    }
}

public class Dog {

    private String name;
    private int age;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if( age < 0 ){
            System.out.println("Wrong year, it will stay the same "+ this.age);
        }else {
            this.age = age;
        }

    }

    private String bark(){
        return "bark";
    }




}

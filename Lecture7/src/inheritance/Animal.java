package inheritance;

public class Animal {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ( name.equals("")){
            System.out.println("Wrong name");
        }else {
            this.name = name;
        }
    }

    public String move(int distance){
        return  name + " is moving "+ distance ;
    }

}

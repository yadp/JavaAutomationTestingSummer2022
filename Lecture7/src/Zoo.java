public class Zoo {
    private String name;
    private Dog[] zooDog;

    public Zoo(){
        zooDog= new Dog[10];
    }

    public void addDog(Dog dogToAdd){
        for (int i = 0; i < zooDog.length; i++) {
            if(zooDog[i]==null){
                zooDog[i] = dogToAdd;
                return;
            }
        }
    }

    public Dog[] getZooDog(){
        return zooDog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}

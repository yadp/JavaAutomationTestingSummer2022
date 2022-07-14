public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int number = 5;
        int number2 = 5;
        String text = "text";
        String text2 = new String("text");

        if( number == number2){
            System.out.println("Numbers are the same");
        } else {
            System.out.println("Not the same");
        }

        if(text.equals(text2)){
            System.out.println("Same text");
        } else {
            System.out.println("Not the same");
        }
    }
}
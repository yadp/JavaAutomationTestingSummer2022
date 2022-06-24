public class ReversString {
    public static void main(String[] args) {
        System.out.println(reverse("Testeyyyy"));

        System.out.println("Is Pal: "+ isPalindrome("t12321t"));
        System.out.println("Is Pal: "+ isPalindrome("test"));

    }

    public static String reverse(String input){
        String reverseString = "";

        for(int i=0;i<input.length();i++){//test
            reverseString=input.charAt(i)+reverseString;// t  //et  //set // tset
        }

        return reverseString;

    }

    public static boolean isPalindrome(String input){
        String reverseString= reverse(input);
        return input.equals(reverseString);
    }
}

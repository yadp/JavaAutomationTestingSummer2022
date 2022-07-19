import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {


        List<String> fixedLengthList = Arrays.asList("C", "C++", "Java");


        List<String> colorList ;

        colorList = new LinkedList<>();
        colorList.add("Green");
        colorList.add("Orange");
        colorList.add("Black");

        System.out.println(colorList);
        colorList.add("Red");
        System.out.println(colorList);
        System.out.println(colorList.indexOf("Red"));
        colorList.remove("Orange");
        System.out.println(colorList);
        System.out.println(colorList.indexOf("Red"));
    }
}

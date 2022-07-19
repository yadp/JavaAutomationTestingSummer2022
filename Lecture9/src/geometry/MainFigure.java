package geometry;

import java.util.ArrayList;
import java.util.List;

public class MainFigure {

    public static void main(String[] args) {
        Circle circle= new Circle(5);
        Rectangle rectangle=new Rectangle(5,4);

        List<GeometryFigure> listFigures = new ArrayList<>();

        listFigures.add(circle);
        listFigures.add(rectangle);

        System.out.println(findLargestArea(listFigures));
    }

    private static double findLargestArea(List<GeometryFigure> listFigures) {
        double maxArea=0;

        for (int i = 0; i < listFigures.size(); i++) {
            if(listFigures.get(i).getArea()>maxArea){
                maxArea = listFigures.get(i).getArea();
            }
        }
        return maxArea;

    }
}

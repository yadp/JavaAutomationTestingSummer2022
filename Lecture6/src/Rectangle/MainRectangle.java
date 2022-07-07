package Rectangle;

public class MainRectangle {
    public static void main(String[] args) {
        int numberOfRectangles = 100;
        Rectangle first = new Rectangle(1,2);

        Rectangle[] rectangles = new Rectangle[numberOfRectangles];

        // null of every value of the rectangle
        for (int i = 0; i < numberOfRectangles; i++) {
            System.out.println(rectangles[i]);
        }

        // Create values
        for (int i = 0; i < numberOfRectangles; i++) {
            rectangles[i] = new Rectangle(i+1,i+2);
        }

        //
        for (int i = 0; i < numberOfRectangles; i++) {
            System.out.println(rectangles[i].getArea());
        }
    }
}

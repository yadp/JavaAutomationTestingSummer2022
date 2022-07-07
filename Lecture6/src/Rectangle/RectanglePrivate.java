package Rectangle;

public class RectanglePrivate {

    private int a;
    private int b;

    public RectanglePrivate(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        if( a > 0 ) {
            this.a = a;
        } else {
            System.out.println("A will stay at " + this.a);
        }
    }

    public void setB(int b) {
        if ( b>0) {
            this.b = b;
        } else {
            System.out.println("B will stay at "+ this.b);
        }
    }

    public int getArea(){
        return a*b;
    }

    public int getPerimeter() {
        return 2*a+2*b;
    }
}

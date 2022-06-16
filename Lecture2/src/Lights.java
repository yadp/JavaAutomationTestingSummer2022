public class Lights {

    public static void main(String[] args) {
        int result=0;
        boolean lightsOff= true;
        int a=100;

        if( lightsOff ){
            result=0;
        } else {
            result=1;
        }

        result = lightsOff?0:(1+a-a);

        System.out.println(result);
    }
}

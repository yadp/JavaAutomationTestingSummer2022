public class ForLoopExample {
    public static void main(String[] args) {

        int a=5;

        a = a+1;
        a++;

        a = a-1;
        a--;

        for(int n=1;n<=10;n++) {
            if(n==3){
                continue;
            }
            System.out.println(n);
        }
    }
}

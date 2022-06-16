public class Months2 {

    public static void main(String[] args) {

        /*
        Write program to check number of days per month
        Input - month with integer
        Output - Number of days ( choose 28 for february )

         */
        int month = 9;
        int days=0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                break;
        }
        System.out.println(days);
    }
}

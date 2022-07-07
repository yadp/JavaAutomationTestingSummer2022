public class MainDice {
    public static void main(String[] args) {
        Dice dice1= new Dice();

        dice1.sides= 20;
        Dice dice2 = new Dice();

        System.out.println(dice1.throwDice());
        System.out.println(dice2.throwDice());
    }

}

import java.util.Random;
import java.util.Scanner;

public class Dice {
    int dice1, dice2,sum1=0,sum2=0;
    double average1,average2;
    public static void main(String[] args) {
        Dice dice = new Dice();
        Random rand = new Random();
        Scanner Scan = new Scanner(System.in);
        
        System.out.print("Enter number of sides for the first dice : ");
        dice.dice1= Scan.nextInt();

        System.out.print("Enter number of sides for the Second dice : ");
        dice.dice2= Scan.nextInt();

        for (int i = 1; i<=3;i++){

            int roll1= rand.nextInt(dice.dice1)+1;
            int roll2 =rand.nextInt(dice.dice2)+1;

            dice.sum1 += roll1;
            dice.sum2 += roll2;

            System.out.println("Dice 1 rolled " +  i +" = " + roll1);
            System.out.println("Dice 2 rolled " +  i +" = " + roll2);
        }

        dice.average1=dice.sum1/3;
        dice.average2=dice.sum2/3;

        System.out.println("Die 1 rolled a total of " + dice.sum1 + " and rolled " + dice.average1 + " on average.");
        System.out.println("Die 2 rolled a total of " + dice.sum2 + " and rolled " + dice.average2 + " on average.");

        Scan.close();
    }
}

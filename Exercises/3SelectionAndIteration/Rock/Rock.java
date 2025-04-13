import java.util.Scanner;
import java.util.Random;

public class Rock{
    public static void main(String[]args){
        String personPlay;
        String computerPlay;
        int computerInt;

        Scanner scan = new Scanner(System.in);
        Random generator =new Random();

        int generator_1=generator.nextInt(3);
        
        System.out.print("Entre R (Rock), P (Paper) or S (Scissors): ");
        personPlay = scan.next();
        personPlay =personPlay.toUpperCase();// Upper Case input

        computerInt = generator_1;// generated num stored in computerInt
        
        switch (computerInt){
            case 0:
            computerPlay = "S";
            break;

            case 1:
            computerPlay = "R";
            break;

            case 2:
            computerPlay = "P";
            break;
            
            default:
            computerPlay = "Null";
            break;
        }

        System.out.println("You chose: " + personPlay);
        System.out.println("Computer chose: " + computerPlay);

        if (personPlay.equals(computerPlay)) {
            System.out.println("It's a tie!");
        } else if (personPlay.equals("R")) {
            if (computerPlay.equals("S")) {
                System.out.println("Rock crushes scissors. You win!!");
            } else if (computerPlay.equals("P")) {
                System.out.println("Paper covers rock. Computer wins!!");
            } else {
                System.out.println("Invalid computer play.");
            }
        } else if (personPlay.equals("P")) {
            if (computerPlay.equals("R")) {
                System.out.println("Paper covers rock. You win!!");
            } else if (computerPlay.equals("S")) {
                System.out.println("Scissors cuts paper. Computer wins!!");
            } else {
                System.out.println("Invalid computer play.");
            }
        } else if (personPlay.equals("S")) {
            if (computerPlay.equals("P")) {
                System.out.println("Scissors cuts paper. You win!!");
            } else if (computerPlay.equals("R")) {
                System.out.println("Rock crushes scissors. Computer wins!!");
            } else {
                System.out.println("Invalid computer play.");
            }
        } else {
            System.out.println("Invalid input. Please enter R, P, or S.");
        }

        scan.close();
    }
}
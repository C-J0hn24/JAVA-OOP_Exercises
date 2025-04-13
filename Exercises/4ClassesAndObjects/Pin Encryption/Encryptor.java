import java.util.Random;
import java.util.Scanner;

public class Encryptor {
    public static void main(String[]args){
        Random rand =new Random();
        Scanner scan = new Scanner(System.in);

        //user prompt
        System.out.print("Enter your Pin: ");
        int pin = scan.nextInt();

        //two random numbers greater than 1000 and less than 65536
        int random1 = rand.nextInt((65536 - 1000) + 1) + 1000;
        int random2 = rand.nextInt((65536 - 1000) + 1) + 1000;

        //convered to hexadecimal
        String hex_ran1=Integer.toHexString(random1);
        String hex_ran2=Integer.toHexString(random2);
        String hex_pin=Integer.toHexString(pin);

        //sandwich
        String sandwich=hex_ran1+(hex_pin)+hex_ran2;

        //output
        System.out.print("Your Encrypted Pin is : " + sandwich);

        scan.close();
    }
}

import  java.util.Scanner;
public class Fraction {
    public static void main(String[] args)
    {
        int val1,val2;
        float fraction;
        Scanner scan = new Scanner(System.in) ;

        // get three values from user
        System.out.print("Enter your numerator : ");
        val1 = scan.nextInt();  // Read user input
        System.out.print("Enter your denominator : ");
        val2 = scan.nextInt();  // Read user input

        // output
        if (val2 == 0){
            System.out.println("Denominator cannot be zero");
            System.exit(0);
        }

        else{        
            fraction = (float)val1/val2;
            System.out.print("The Fraction is : " +  (fraction) );
            scan.close();
        }

    }
}

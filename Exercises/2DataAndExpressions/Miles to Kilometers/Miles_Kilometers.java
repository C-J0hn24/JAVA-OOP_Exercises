import java.util.Scanner;
public class Miles_Kilometers{
    public static void main(String[] args)
    {
       float val1;
       Scanner scan = new Scanner(System.in) ;


       // get three values from user
       System.out.print("Enter distance in Miles : ");
        val1 = scan.nextFloat();  // Read user input

        System.out.print("The distance in Kilometer : " +  (val1*1.60935)+" km" );
        scan.close();
    }
}
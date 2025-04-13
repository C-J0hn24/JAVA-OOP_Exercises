import java.util.Scanner;
public class Square_Calculations {
    
    public static void main(String[] args)
    {
        int val1;
        Scanner scan = new Scanner(System.in) ;

       // get three values from user
        System.out.print("Enter Length of your square : ");
        val1 = scan.nextInt();  // Read user input

        System.out.println("The Cube's Peremeter : " +  (4*val1) );
        System.out.println("The CUbe's Area : " +  (val1*val1) );
        scan.close();
    }
}

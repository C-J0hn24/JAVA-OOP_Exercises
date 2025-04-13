import java.util.Scanner;
public class Average
{
    public static void main(String[] args)
    {
       int val1, val2, val3;
       Scanner scan = new Scanner(System.in) ;


       // get three values from user
       System.out.println("Please enter first integer and " + "I will compute their average");
        val1 = scan.nextInt();  // Read user input
        System.out.println("Please enter second integers and " + "I will compute their average");
        val2 = scan.nextInt();
        System.out.println("Please enter thirdintegers and " + "I will compute their average");
        val3 = scan.nextInt();

        System.out.print("The average is : " +  (val1+val2+val3)/3);
        
        scan.close();
    }
}

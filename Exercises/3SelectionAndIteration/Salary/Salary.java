import java.util.Scanner;
import java.text.NumberFormat;


    
public class Salary {


    public void printMoney(double currentSalary , double raise , double newSalary , String Rating){
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println();
        System.out.println("Current Salary:       " + money.format(currentSalary));
        System.out.println("Amount of your raise: " + money.format(raise));
        System.out.println("Your new salary:      " + money.format(newSalary));
        System.out.println();
        
    }
    
    public static void main (String[]args){
        double currentSalary;
        double raise;
        double newSalary;
        String rating;

        Scanner scan = new Scanner(System.in);
        System.out.print ("Enter the current Salary: ");
        currentSalary= scan.nextDouble();
        System.out.print("Enter Performance rating (Excellent,Good or Poor): ");
        rating = scan.next();

        if (rating.equalsIgnoreCase("Excellent")) {
            raise = (currentSalary * 0.06); // raise of 6%
            newSalary = currentSalary + raise;
            Salary printer = new Salary();
            printer.printMoney(currentSalary, raise, newSalary, rating);
        }

        else if(rating.equalsIgnoreCase("Good")){
            raise = (currentSalary * 0.04);     // raise of 4%
            newSalary = currentSalary + raise;
            Salary printer = new Salary();
            printer.printMoney(currentSalary, raise, newSalary, rating);
        }

        else if(rating.equalsIgnoreCase("Good")){
            raise = (currentSalary * 0.015);  // raise of 1.5%
            newSalary = currentSalary + raise;
            Salary printer = new Salary();
            printer.printMoney(currentSalary, raise, newSalary, rating);
        }


        else {
            System.out.print("Error Invalid thing");
        }
        scan.close();

    }
}

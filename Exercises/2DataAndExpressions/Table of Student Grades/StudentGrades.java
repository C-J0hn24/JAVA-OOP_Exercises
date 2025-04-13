/*import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args){

        Scanner input_choice = new Scanner(System.in);
        System.out.print("Add Student? (y/n): ");
        String choice = input_choice.nextLine();

        do{
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the student's name: ");
            String name = input.nextLine(); 

            System.out.print("Enter the student's lab average: ");
            int lab = input.nextInt();

            System.out.print("Enter the student's bonus points: ");
            int bonus = input.nextInt();

            int total = lab + bonus;
            System.out.println(name + "            " + lab + "       " + bonus + "       " + total);
            input.close(); 

        } while(choice=="y");

        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\r\n" + "==          Student Points          ==\r\n" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////\r\n");
        System.out.println("Name            Lab     Bonus   Total\r\n" + "----            ---     -----   -----\r\n");
        
        input_choice.close();
        
    }
}
*/


public class StudentGrades {

    public static void printStudent(String name, int labPoints, int bonusPoints) {
        int total = labPoints + bonusPoints; 
        System.out.println(name + "\t\t" + labPoints + "\t" + bonusPoints + "\t" + total);
    }
    public static void main(String[] args) {
        
        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\r\n" + "==          Student Points          ==\r\n" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////\r\n");
        
        System.out.println("Name\t\tLab\tBonus\tTotal");
        System.out.println("----\t\t---\t-----\t-----");

        printStudent("Joe", 43, 7);
        printStudent("William", 50, 8);
        printStudent("Batman", 45, 6);
        printStudent("Spooder", 51, 3);
        printStudent("Catman", 42, 5);
    }


}
import java.util.Scanner;

public class String_Reverse {
    public static void main(String[]args){
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter text: ");
        String Text = scan.nextLine();

        StringBuilder rev = new StringBuilder();
        rev.append(Text);
        rev.reverse();

        System.out.print(rev);
        scan.close();
    }
    
}
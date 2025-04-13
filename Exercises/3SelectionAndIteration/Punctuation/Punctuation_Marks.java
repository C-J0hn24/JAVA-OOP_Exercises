import java.util.Scanner;

public class Punctuation_Marks {

    public static void main(String[]args){
         Scanner scan = new Scanner(System.in);
         System.out.print("Enter Your Text: ");
         String text = scan.nextLine();

         int commaC=0;
         int periodC=0;
         int hyphenc=0;

         for (int i =0; i < text.length(); i++){ //I took this piece of code from StackOverflow
            char ch = text.charAt(i);
         
            if (ch == ','){
                commaC++;
            }
            else if (ch == '.'){
                periodC++;
            }
            else if (ch == '-'){
                hyphenc++;
            }
        }
        System.out.println("Punctuation Mark | Count");
        System.out.println("----------------|-------");
        System.out.println("Comma (,)       | " + commaC);
        System.out.println("Period (.)      | " + periodC);
        System.out.println("Hyphen (-)      | " + hyphenc);
        System.out.println("------------------------");

         scan.close();
    }
   
    
}

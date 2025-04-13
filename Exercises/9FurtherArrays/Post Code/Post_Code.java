import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

class main{
    Random rand = new Random();

    protected String f_name, l_name, p_code;
    //ik i could've used list class but 2d array works just fine in this case..
    protected String[][] data = new String[26][3];

    //generates data aka first name lastname n postal code
    void data_gen() {
        int count =0;
        do{
        this.p_code = Integer.toString(rand.nextInt(5000,6000));
        this.f_name = "f_Name" + Integer.toString(rand.nextInt(100, 300));
        this.l_name = "l_Name" + Integer.toString(rand.nextInt(400, 800));
        
        data[count] = new String[]{"First Name: "+f_name+"\t"+"Last Name: "+l_name+"\t"+ "Post Code: " + p_code};

        count++;
        }  while (count!=25);
    }
}
class sub extends main{
    protected String u_fName,u_lName,u_pCode;
    Scanner scan = new Scanner(System.in);
    // for user inputs
    void user(){
        data_gen();

        System.out.print("Enter First Name :");
        this.f_name=(u_fName=scan.nextLine());

        System.out.print("Enter Last Name :");
        this.l_name=(u_lName=scan.nextLine());

        System.out.print("Enter Post Code :");
        this.p_code=(u_pCode =scan.nextLine());
        System.out.print('\n');
        //indexing starts from 0 so i can use 25 as the row length
        data[25] = new String[]{"First Name: "+f_name+"\t"+"Last Name: "+l_name+"\t"+"Post Code: "+p_code};
        
    }
}

class display extends sub{
    void run(){
        user();
        for (String[] row : data) { // copied this code from stackoverflow to print array 
            System.out.println(Arrays.toString(row));
        }
    }
}
public class Post_Code {
    public static void main(String[] args) {
        display d = new display();
        d.run();
    }
}

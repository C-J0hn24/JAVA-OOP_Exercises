import java.util.Random;
import java.util.Scanner;

//main class stores money
class customers{
    protected String name;
    protected int acc_pin;
    protected double amount;
    protected String[] data;

    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    protected void custom_info() {
        System.out.println('\n'+"LL Bank Account Creation"+'\n');
        System.out.print("Enter Your Name : ");
        this.name=scan.nextLine();
        this.acc_pin=rand.nextInt(1000,2000);
        this.amount=0;
        System.out.println('\n'+"Welcome to LL Banking Services "+name+'\n'+'\n'+"Your Account Pin Number : "+ acc_pin+'\n'+"Your Current Balance : "+"$"+amount+'\n');
    }
    
    void c_data(){
        custom_info();
        data=new String[]{name,String.valueOf(acc_pin)+amount};
    }

}
//deposits money
class deposti extends customers{
    protected double Dp_amnt;

    protected void money_dpst (){
        c_data();
        System.out.print("Enter Deposit Amount : ");
        Dp_amnt=scan.nextDouble();
        amount=amount+Dp_amnt;
        System.out.print('\n'+"Money has been added : $"+amount);
    }

    //multiple forms aka polymorphism
    @Override
    void c_data(){
        custom_info();
        data=new String[]{name,String.valueOf(acc_pin)+amount};
    }
}
//money withdraw
class withdrawl extends deposti{
    protected double Wd_amnt=0;

    protected void wthdraw(){
        money_dpst();  

        //checks if withdraw amount exceeds whats been deposited
        boolean checker = false;

        while(!checker){

        System.out.print('\n'+"Enter Withdraw Amonunt : $");
        Wd_amnt=scan.nextDouble();
       
            if (Wd_amnt>amount){
                System.out.println('\n'+"Amount exceeded brokie try with lower amount"+'\n'+ "You Currently Have : $"+amount+'\n');
            }
            else{
                System.out.print('\n'+"$"+Wd_amnt+" Successfully Withdrawn!"+'\n');
                amount=amount-Wd_amnt;
                System.out.println('\n'+"Your New Balance : "+ amount);
                checker = true;
            }
        }
    }
}

class run extends withdrawl{
    protected void main(){
        super.wthdraw();
    }
}

public class BankAccounts extends customers {
    public static void main(String[] args) {
        run r = new run();
        r.main();
    }
}

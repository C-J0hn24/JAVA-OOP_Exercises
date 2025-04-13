import java.util.Scanner;

class Bulb{
    private int Switch;
    //parameterized constructor
    Bulb(int Switch){
        this.Switch = Switch;
    }
    //get set for switch
    int getSwitch(){
        return Switch;
    }
    void setSwitch(int Switch){
        this.Switch = Switch;
    }
    // checks the switch status
    String checkSwitch(){
        if (getSwitch() == 1){
            return "Bulb is ON";
        }
        else if (getSwitch()==0){
            return "Bulb is OFF";
        }
        else {
            return "Invalid Input Type 1 (On) or 0(Off)";
        }    
    }
}

public class Lights {
    public static void main(String[] args) {
        //constructor & method initialization
        Scanner scan = new Scanner(System.in);
        System.out.print("Bulb Interaction (1 = On || 0 = Off) : ");
        Bulb bulb = new Bulb(scan.nextInt());//input
        System.out.print(bulb.checkSwitch());//output
        scan.close();
    }
}

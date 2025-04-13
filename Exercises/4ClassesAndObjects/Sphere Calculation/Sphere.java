import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double radius,volume,S_area;

        //user prompt
        System.out.print("Enter Radius: ");
        radius = scan.nextDouble();

        //calculations
        volume = (4*3.14*Math.pow(radius, 3))/3;
        S_area = (4*3.14*Math.pow(radius,2));
        //output
        System.out.println("Volume of Sphere: "+ volume);
        System.out.println("Sufrace Area of Sphere: "+ S_area);

        scan.close();
    }
}

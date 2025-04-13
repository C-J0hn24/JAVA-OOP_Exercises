import java.util.Scanner;

class Sphere{// a default class 

    // with setter and getter method (mostly  used for private variables but has other functionality)
    private double Diameter,Volume,S_area; // access modifyer set to private so nobody can access this variable outside of this class

    //Constructor stores temporary value (reason for this is to set layout)
    Sphere(double Diameter){ 
         // "this." keyword assigns value from parameter to variable.
        this.Diameter = Diameter;
    }

    // getter only raeds the data in a variable
    double getDiameter(){
        return this.Diameter;
    }

    // setter allows the data to be modified
    void setDiameter(double Diamater){ 
        this.Diameter = Diamater;
    }

    double calc_volume(){
        double Radius = this.Diameter/2;
        this.Volume = (4.0/3.0)*Math.PI*Math.pow(Radius,3);
        return this.Volume;
    }
    
    double calc_surface_area(){
        double Radius = this.Diameter/2;
        S_area= 4 * Math.PI * Math.pow(Radius, 2);
        return S_area;
    }
}

public class MultiSphere{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//scan input method call
        System.out.print("Enter the Diameter of Sphere : ");
        
        Sphere sphere = new Sphere(scan.nextDouble());// initializing sphere constructor call from Sphere class
        // using toString()
        String myStr = ("   | "+ "Diameter : "+ sphere.getDiameter() + " |   | "+ "Volume : "+ sphere.calc_volume()+ " |   | "+ "Surface Area : "+ sphere.calc_surface_area()+" |   ");//fetching private variable Diamater from class Sphere 
        System.out.println(myStr.toString());

        scan.close();

    }
}
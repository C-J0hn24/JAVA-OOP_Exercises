public class ShinyDiamond {
    public static void main(String[] args) {
        System.out.println("   *");
        System.out.println("  ***");
        System.out.println(" *****");
        System.out.println("*******");
        System.out.println(" *****");
        System.out.println("  ***");
        System.out.println("   *"); 
        

        System.out.println("With Loops");

        for (int i =1; i<=4; i++){
            for (int s=4; s>i;s--){
                System.out.print(" ");
            }
            for (int j=1; j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        };

        for (int i=4; i<1;){
            for (int s=1; s<i;s++){
                System.out.print(" ");
            }
            for (int j=6; j>=(2*i+1);j--){
                System.out.print("*");
            }
        };
    }
}

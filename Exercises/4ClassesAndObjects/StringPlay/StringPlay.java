
public class StringPlay {
    public static void main (String[]args){
        String college= new String ("Leeds Beckett University");
        String Town = " Anytown,UK ";//part a

        int stringLength;
        String change1, change2, change3;
        
        stringLength=college.length();//part b

        System.out.println(college + " contains " + stringLength + "characters.");
        
        change1= college.toUpperCase(); //part c

        change2= college.replace('e','*'); //part d

        change3=college.concat(Town); //part e

        System.out.println("The final String is " + change1);
        System.out.println("The final String is " + change2);
        System.out.println("The final String is " + change3);
    }
    
}

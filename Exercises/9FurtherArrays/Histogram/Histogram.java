import java.util.Arrays;
import java.util.Random;

class arrayGen{
    Random rand = new Random();

    //i created this simple array generator
    int[] gen(){
        int index=20;
        int []arrays= new int[index]  ;
        for (int i = 0; i!=index;i++){
            int random =rand.nextInt(0,100);
            arrays[i]=random;
        }
        return arrays;
    }
}

class main{
    int [] num;

    main(int[]num){
        this.num=num;
    }
    //i spent 3hrs on this **cries in skill issue**
    void run(){
        //shows generated arrays
        System.out.println('\n'+"Generated Array : "+Arrays.toString(num)+'\n');

        String star="*";        
        //loop to make the table thing
        for (int i = 0; i!=10; i++){
            int count = 0;
            int first = (i* 10)+1;
            int last = (first +10)-1;
            //another loop to count the lenght of given arrays
            for(int c = 0; c<num.length;c++){
                int a = num[c];
                //another another loop that compares values from array in certain range
                if ( a >= first && a <last ){
                    count ++;
                }     
            }
            System.out.println(first+" - "+last+" | "+star.repeat(count));
        }            
    }
}

public class Histogram {
    public static void main(String[] args) {
        //int[] num = {16,3,3,3,44,5, 12, 7, 3, 15, 8};
        arrayGen ara_ara = new arrayGen();
        //System.out.println('\n'+"Generated Array : "+Arrays.toString(ara.gen())+'\n');
        main m = new main(ara_ara.gen());
        m.run();
    }
}

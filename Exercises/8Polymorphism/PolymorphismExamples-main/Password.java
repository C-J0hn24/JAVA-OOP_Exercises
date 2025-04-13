import java.util.Random;

public class Password implements Encryptable  {

    private String txt;
    private boolean crypt_status;

    public Password(String msg){
        crypt_status = false;
        txt = msg;
    }

    //my custom very basic encryptor
    public void encrypt(){

        System.out.println('\n'+"Default Text : "+txt);
 
        if (crypt_status==false){
            //reverse txt
            StringBuilder rev = new StringBuilder(txt);
            rev.reverse();

            //splits the txt 
            String[] rev_split = rev.toString().split("");
            
        //adds random gen num after each split char
        StringBuilder processedTxt = new StringBuilder();
        Random rand = new Random();

        for (String c : rev_split) {
            int randomNum = rand.nextInt(10); ///rand num fomr 0 to 9
            processedTxt.append(c).append(randomNum); //sandwitch split char and rand num
        }
        // Save the processed text
        txt = processedTxt.toString();
        crypt_status = true;

        System.out.println('\n'+"Encrypted Text: " + txt);  
        }
        crypt_status = true;
    }

    
    //my custom very basic decryptor
    public String decrypt() {
        if (crypt_status==true) {
            //removes random numbers
            StringBuilder cleanedtxt = new StringBuilder();
            for (int i = 0; i < txt.length(); i += 2) {
                cleanedtxt.append(txt.charAt(i)); // 
            }
            // reverses the string to get the original text
            String meow=cleanedtxt.reverse().toString();
            // returns the decrypted text
            return '\n'+"Decrypted Text: "+ meow + '\n';
        }
        crypt_status = false;
        return "unencrypted txt!";
    }
}

//execute
class Password_Test {
    public static void main(String[] args) {
        Password pwrd = new Password("I ate my cat and i will eat another");
        pwrd.encrypt();

        System.out.println(pwrd.decrypt());
    }
}
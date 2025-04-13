import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Locale;

public class DeliFormat {
    public static void main(String[] args) {
        final double OUNCES_PER_POUND = 16.0;

        double pricePerPound, weightOunces, weight,totalPrice;

        Scanner scan =new Scanner(System.in);

        //creating number format
        Locale locale = Locale.of("en", "GB");
        NumberFormat Money = NumberFormat.getCurrencyInstance(locale);

        //creating decimal format
        DecimalFormat fmt = new DecimalFormat("0.##");
        
        //user prompt
        System.out.println ("Welcome to the CS Deli!!\n ");
        System.out.print ("Enter the price per pound of your item: ");
        pricePerPound = scan.nextDouble();

        System.out.print ("Enter the weight (ounces): ");
        weightOunces = scan.nextDouble();

        //ounces to pounds
        weight = weightOunces / OUNCES_PER_POUND;
        totalPrice = pricePerPound * weight;
        
        //formatting sumbers
        String formattedPrice = Money.format(pricePerPound);  // Format price per pound
        String formattedWeight = fmt.format(weight);         // Format weight
        String formattedTotal = Money.format(totalPrice);    // Format total price
        
        // Print the label in required format
        System.out.println("\n      *****  CS Deli  *****\n");
        System.out.println("     Unit Price: " + formattedPrice + " per pound");
        System.out.println("     Weight: " + formattedWeight + " pounds");
        System.out.println("\n     TOTAL:  " + formattedTotal);
        
        //closing scan
        scan.close();
    }
}

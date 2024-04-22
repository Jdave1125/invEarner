//investment earnings
// enter the buying price per share
// enter closing price on subsequent days
// calc. aggregate earnings/losses after each day
// leave program when closing price is negative

//input scanner (we req user input so use scanner)

import java.util.Scanner;
import java.text.*;

public class Main {

    public static void main(String[] args) {
        //scanner obj to rec user input
        Scanner scan = new Scanner(System.in); //create Scanner obj (scan) -- rec in from std.input
        System.out.println("Enter your buying price"); //prompt for user to enter buy in
        double buyingPrice = scan.nextDouble(); //will store buyingPrice
        int day = 1;
        double closingPrice = 0.1; // set up more than 0 so loop doesn't immediately break
        DecimalFormat df = new DecimalFormat("0.00"); //class provided by java.text, create df (obj ref) points to new decimal format obj

        while (true) { //endless loop while closing price isn't negative
            System.out.println("Enter the closing price for the day " + day + " (any negative value leaves program:");
            //check closing price
            closingPrice = scan.nextDouble();
            if(closingPrice<0.0) break; // if our closing price is negative, break OUR CONDITION
            double earnings = closingPrice - buyingPrice;

            if(earnings > 0.0){
                System.out.println("After day "  + day + " ,you earned" +" "+ df.format(earnings) + " per share"); //apply df to earnings for decimal format
            }
            else if(earnings<0.0){
                System.out.println("After day " + day + " ,you lost" +" "+ df.format(-earnings) + " per share");
            }else {
                System.out.println("After day " + day + " your earnings are 0 per share");
            }
            day +=1;
        }
        scan.close();
    }
}
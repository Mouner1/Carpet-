/*
 * This page was created by Mouner Dabjan
 * on September 20
 * To calculate the price of a carpet
 */

package carpet;

/**
 *
 * @author modab5310
 */
public class Carpet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double length= 8.5;
        double width= 6.00;
        double one= 19.95; 
        
        //algorithms for calculating the carpet's price
        
        double price= length*width; 
        
        System.out.println(price+ " For one meter sqaured"); 
        
        double carpet= price*one;
        
        System.out.println("The price of the carpet is" + carpet); 
    }
    
}

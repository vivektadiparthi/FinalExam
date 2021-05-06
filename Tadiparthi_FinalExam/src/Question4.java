/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sai Vivek Reddy Tadiparthi
 */
public class Question4 {
    public static void main(String[] args)
    {
        //declaring a double variable
        double viv= 678.09;
        //explicit conversion or narrowing widening 
        long tad = (long)viv;
        //explicit conversion or narrowing widening 
        int sai =  (int)tad;
        
        //printing values of every variable
        System.out.println("Double value is: "+viv);
        System.out.println("explicitly converted long value is: "+tad);
        System.out.println("explicitly converted integer value is: "+sai);
    }
    
}

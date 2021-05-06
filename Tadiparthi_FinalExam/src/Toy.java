/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sai Vivek Reddy Tadiparthi
 */
public class Toy {

    
    public static void main(String[] args) {
        // TODO code application logic here
        ToyShop t = new ToyShop(35.0,5,7.5);
        
        System.out.println("Price after discount " + t.discountPrice());
    }
    }


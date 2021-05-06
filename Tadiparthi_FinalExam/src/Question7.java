
import java.io.File;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sai Vivek Reddy Tadiparthi
 */
public class Question7 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = new int[99];
        Scanner s = new Scanner(System.in);
        for (int b = 0; b < 99; b++) {
            a[b] = (int) (Math.random() * 50 + 1);
        }
        System.out.print("Please enter integer for index between 1 to 100");
        int i = s.nextInt();
        if (i > 99) {
            System.out.println("Index must be less than 99");
        } else {
            System.out.println("Value at given index" + i + ": " + a[i]);
        }

    }

}

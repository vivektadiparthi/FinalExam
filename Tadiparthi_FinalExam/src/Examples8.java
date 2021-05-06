/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sai Vivek Reddy Tadiparthi
 */
public class Examples8 {
    public static void main(String[] args) {

        System.out.println("Final exam");
        System.out.println("Vivek's answer for Question:\n");

        Scanner src = new Scanner(System.in);

        System.out.print("Enter the input number: ");

        int v = src.nextInt();

        countDown(v);
    }

    public static void countDown(int v) {

        if (v == 0) {
            System.out.println("Recursion Ended");
        } else {
            System.out.println(v);
            countDown(v - 1);
        }
    }

}

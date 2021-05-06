/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sai Vivek Reddy Tadiparthi
 */
public class Example9 {
    public static void main(String[] args) {

        System.out.println("Final Exam");
        System.out.println("Vivek reddy Tadiparthi\n");

        Scanner src = new Scanner(System.in);

        System.out.print("Enter the input number: ");

        int input = src.nextInt();

        infiniteRecursion(input);
    }

    public static void infiniteRecursion(int i) {

        System.out.println(i + ": Infinite Recursion");

        if (i != 0) {
            i++;
            infiniteRecursion(i);
        }

    }

}

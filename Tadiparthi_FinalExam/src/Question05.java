/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sai Vivek Reddy Tadiparthi
 */
public class Question05 {
    public static void main(String[] args) {

        System.out.println("Final Exam");
        System.out.println("Sai Vivek Tadiparthi");
        
        System.out.println("Answer:\n");

        ComparableCircle c1 = new ComparableCircle(3);
        ComparableCircle c2 = new ComparableCircle(5);

        if (c2.compareTo(c1) < 0) {
            System.out.println("c1 has larger area");
        } else if (c2.compareTo(c1) > 0) {
            System.out.println("c2 has larger area");
        } else {
            System.out.println("c1 and c2 have equal area");
        }
    }
}

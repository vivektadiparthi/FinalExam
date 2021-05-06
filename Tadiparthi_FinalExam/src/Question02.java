/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sai Vivek Reddy Tadiparthi
 */
public class Question02 {
    
    public static void main(String[] args) {

        System.out.println("Final Exam");
        System.out.println("Sai Vivek Tadiparthi");
        System.out.println("Question 2:\n");

        GeometricObject go0 = new Square(5.0);
        GeometricObject go1 = new Square(7.5);
        GeometricObject go2 = new Square(9.6);
        GeometricObject go3 = new Square(0.9);
        GeometricObject go4 = new Square(6.0);

        GeometricObject[] gObject = new GeometricObject[5];

        gObject[0] = go0;
        gObject[1] = go1;
        gObject[2] = go2;
        gObject[3] = go3;
        gObject[4] = go4;
        
        int l = gObject.length;

        
        for (int i = 0; i < l; i++) {
            System.out.print("Area of Square " + i + " is: " + gObject[i].area()
                    + " and ");
            gObject[i].howToColor();
        }
    }
    
}

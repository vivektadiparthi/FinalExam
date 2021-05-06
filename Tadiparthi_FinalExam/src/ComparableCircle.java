/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sai Vivek Reddy Tadiparthi
 */
public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle(double diameter) {
        super(diameter);
    }

    public double area() {
        return (Math.PI * Math.pow(diameter / 2.0, 2));
    }

    @Override
    public int compareTo(ComparableCircle c) {
        if (this.area() == c.area()) {
            return 0;
        } else if (this.area() > c.area()) {
            return 1;
        } else {
            return -1;
        }
    }

}

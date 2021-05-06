/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sai Vivek Reddy Tadiparthi
 */
public class ToyShop extends ToysrUS{
    
    
    private double cost;
    private int productnumber;
    private double discount;
    public ToyShop(double cost, int productnumber, double discount) {
        this.cost=cost;
        this.productnumber=productnumber;
        this.discount=discount;
    }

    public double discountPrice() {
        return cost - discount/100.00;
    }
    }


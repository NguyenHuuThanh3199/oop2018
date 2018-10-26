/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

/**
 *
 * @author Huu Thanh
 */
public class Circle extends Shape{
    public static final double PI=3.14;
    private double radius=1.0;
    private Point center;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
    public Circle()
    {
        
    }
    public Circle(double radius)
    {
        super();
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled)
    {
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea()
    {
        return this.radius*this.radius*PI;   
    }
    public double getPerimeter()
    {
        return 2*PI*this.radius;
    }
    @Override
    public String toString()
    {
        String a="Day la hinh tron";
        return a;
    }
}

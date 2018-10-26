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
public class Rectangle extends Shape{
    private double width=1.0;
    private double length=1.0;
    public Rectangle()
    {
        
    }
    public Rectangle(double width,double length)
    {
        super();
        this.length=length;
        this.width=width;
    }
    public Rectangle(double width, double length, String color, boolean filled)
    {
        super(color,filled);
        this.length=length;
        this.width=width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea()
    {
        return this.length*this.width;   
    }
    public double getPerimeter()
    {
        return 2*(this.length+this.width);
    }
    @Override
    public String toString()
    {
        String a="Day la hinh chu nhat";
        return a;
    }
}

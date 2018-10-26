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
public class Square extends Rectangle{
    public Square()
    {
        
    }
    public Square(double side)
    {
        super(side, side);
    }
    public Square (double side, String color, boolean filled)
    {
        super(side,side,color,filled);
    }
    public double getSide()
    {
        return super.getLength();
    }
    public void setSide(double side)
    {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Day la hinh vuong"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side); 
        super.setLength(side);//To change body of generated methods, choose Tools | Templates.
    }
    
}

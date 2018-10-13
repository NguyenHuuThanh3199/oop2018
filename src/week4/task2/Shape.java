/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task2;

/**
 *
 * @author Huu Thanh
 */
public class Shape {
    private String color="red";
    private boolean filled=true;
    public Shape()
    {
        
    };
    public Shape(String color, boolean filled)
    {
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString()
    {
        return "color: "+this.color+"\nFilled: "+this.filled;
    }
    
//    public static void main(String[] args) {
//     
//        System.out.println("----------Test Shape----------");
//        Shape a=new Shape();
//        System.out.println(a.toString());
//        Shape b=new Shape("blue",true);
//        System.out.print(b.toString());
//    }
    
}

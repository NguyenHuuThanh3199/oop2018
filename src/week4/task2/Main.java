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
public class Main {
    public static void main(String [] argv )
    {
        System.out.println("=======Test Shape============= ");
        Shape shape=new Shape();
        shape.toString();
        
        
        System.out.println("=======Test circle============= ");
        Circle circle=new Circle();
        System.out.println("Dien tich:"+circle.getArea());
        System.out.println("Chu vi: "+circle.getPerimeter());
        System.out.println(circle.toString());
        
        
        System.out.println("=======Test Rec============= ");
        Rectangle rec=new Rectangle();
        System.out.println(rec.getArea());
        System.out.println(rec.getPerimeter());
        System.out.println(rec.toString());
        
        System.out.println("=======Test Squa====");
        Square sqa=new Square(5);
        System.out.println(sqa.getArea());
        System.out.println(sqa.getPerimeter());
        System.out.println(sqa.toString());
        
    }
}

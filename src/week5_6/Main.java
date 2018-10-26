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
public class Main {
    public static void main(String [] argv )
    {
        Circle a= new Circle();
        Triangle b= new Triangle();
        Square c=new Square();
        Rectangle d=new Rectangle();
        Layer layer=new Layer();
        layer.addShape(a);
        layer.addShape(b);
        layer.addShape(c);
        layer.addShape(d);
        
        Layer layer1=new Layer();
        layer1.addShape(a);
        layer1.addShape(b);
        layer1.addShape(c);
        layer1.addShape(d);
        
        Diagram diagram=new Diagram();
        diagram.addNewLayer(layer);
        diagram.addNewLayer(layer1);
        System.out.println("========Truoc khi xoa layer======");
        layer.out();
        System.out.println("========Truoc khi xoa digram======");
        diagram.out();
        
        //Test Delete Triangle
        System.out.println("=======Test DeleteTriangle=======");
        layer.DeleteTriangle();
        layer.out();
        
        
        //Test Delete Cirlce
        System.out.println("=======Test DeleteCirlde=========");
        diagram.DeleteCirCleDiagram();
        diagram.out();
    }
}

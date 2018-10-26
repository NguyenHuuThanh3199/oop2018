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
public class Triangle extends Shape {
    private Point[] point=new Point[3];

    public Point[] getPoint() {
        return point;
    }

    public void setPoint(Point[] point) {
        this.point = point;
    }
    @Override
    public String toString()
    {
        return "Day la hinh tam giac";               
    }
    
}

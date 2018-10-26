/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

import java.util.ArrayList;

/**
 *
 * @author Huu Thanh
 */
public class Layer {
    private ArrayList<Shape> layer=new ArrayList<>();

    public ArrayList<Shape> getLayer() {
        return layer;
    }

    public void setLayer(ArrayList<Shape> layer) {
        this.layer = layer;
    }
    
    public void DeleteTriangle()
    {
        
        for(int i=0;i<layer.size();i++)
        {
            if(layer.get(i) instanceof Triangle)
            {
                layer.remove(layer.get(i));
            }
        }
    }
    
    public void DeleteCircle()
    {
        for(int i=0;i<layer.size();i++)
        {
            if(layer.get(i) instanceof Circle)
            {
                layer.remove(layer.get(i));
            }
        }
    }
    
    public void addShape(Shape a)
    {
        layer.add(a);
    }
    public void out()
    {
        for(int i=0;i<layer.size();i++)
        {
            System.out.println(layer.get(i).toString());
        }
    }
}

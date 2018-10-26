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
public class Diagram {
    private ArrayList<Layer> diagram=new ArrayList<>();

    public ArrayList<Layer> getDiagram() {
        return diagram;
    }

    public void setDiagram(ArrayList<Layer> diagram) {
        this.diagram = diagram;
    }
    public void DeleteCirCleDiagram()
    {
        for(int i=0;i<diagram.size();i++)
        {
            diagram.get(i).DeleteCircle();
        }
    }
    
    public void addNewLayer(Layer e)
    {
        diagram.add(e);
    }
    public void out()
    {
        for(int i=0;i<diagram.size();i++)
        {
            diagram.get(i).out();
        }
    }
}

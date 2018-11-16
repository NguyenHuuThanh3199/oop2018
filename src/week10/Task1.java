package week10;

import sun.awt.geom.AreaOp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static ArrayList<String> getAllFuncion(File path)
    {
        ArrayList<String> funcion=new ArrayList<>();
        File file = new File(path.getAbsolutePath());
        int i=0;
        int open=1,close=0;
        try {
            String a="";
            String d="";
            Scanner scanner=new Scanner(file);
            while(scanner.hasNextLine())
            {
                if((d=scanner.nextLine()).contains("static"))
                {
                    a=d;
                    a+="\n";
                    while(open!=close)
                    {
                        String c="";
                        c=scanner.nextLine();
                        if(c.contains("}")) close+=1;
                        if(c.contains("{")) open+=1;
                        a+=c;
                        a+="\n";
                    }
                    funcion.add(a);
                }
                a="";
                open=1;
                close=0;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return funcion;
    }
    public String findFuncionByName(String name)
    {
        String filepath="C:\\Github\\oop2018\\src\\week9\\Utils.java";
        File fileRead=new File(filepath);
        int i=0;
        ArrayList<String> dataType =new ArrayList<String>();
        try {
            Scanner scanner=new Scanner(fileRead);
            while (scanner.hasNext())
                if(scanner.nextLine().contains(name))
                {
                    if(scanner.next()== "(")
                    {
                        while(scanner.next()!=")")
                        {
                            dataType.add(scanner.next());
                            i++;
                        }
                    }
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return name;
    }

    public static void main(String[] args) {

        File file =new File("C:\\Github\\oop2018\\src\\week9\\Utils.java");
        ArrayList <String> a=new ArrayList<String>();
        a=getAllFuncion(file);
        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i));
            System.out.println("-----------------------------------");
        }

    }
}

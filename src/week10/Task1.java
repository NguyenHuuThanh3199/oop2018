package week10;

import sun.awt.geom.AreaOp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static List<String> getAllFuncion(File path)
    {
        List<String> funcion=new ArrayList<>();
        File file = new File(path.getAbsolutePath());
        int i=0;
        int open=1,close=0;
        try {
            String a="";
            String d="";
            Scanner scanner=new Scanner(file);
            while(scanner.hasNextLine())
            {
                if((d=scanner.nextLine()).contains("static")&&!d.contains("//"))
                {
                    a=d;
                    //a+="\n";
                    while(open!=close)
                    {
                        String c="";
                        c=scanner.nextLine();
                        if(c.contains("}")) close+=1;
                        if(c.contains("{")) open+=1;
                        a+=c;
                        //a+="\n";
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
    public static String findFuncionByName(String name)
    {
        String filepath="C:\\Github\\oop2018\\src\\week9\\Utils.java";
        File fileRead=new File(filepath);
        String allDataFile="";
        try {
            Scanner scanner=new Scanner(fileRead);
            while(scanner.hasNextLine())
            {
                allDataFile+=scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        allDataFile.replace(" path","")
                .replace(" content","")
                .replace(" data","")
                .replace(" folderPath","")
                .replace(" filename","");
        if(allDataFile.contains(name)) return "tim thay "+name;
        else return "khong tim thay "+name;
    }
    
    public static void main(String[] args) {

        File file =new File("C:\\Github\\oop2018\\src\\week9\\Utils.java");
        List <String> a=new ArrayList<String>();
        a=getAllFuncion(file);
        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i));
            System.out.println("-----------------------------------");
        }
        System.out.println(findFuncionByName("findFileByName(String, String)"));
    }
}

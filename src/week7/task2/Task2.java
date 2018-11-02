package week7.task2;

import week7.task1.Addition;
import week7.task1.Expression;
import week7.task1.Numeral;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task2 {
    public static Integer Addition( Integer a, Integer b) throws NullPointerException
    {
        return a+b;
    }
    public static double Division(int a,int b) throws ArithmeticException
    {
        return a/b;
    }

    public static int Addition(int[] a, int i, int j) throws  ArrayIndexOutOfBoundsException
    {
        return a[i]+a[j];
    }

    public static  void openfile(String filename) throws FileNotFoundException
    {
        File file=new File(filename);
        FileInputStream fileInputStream = new FileInputStream(file);
    }
    public static void castingInt_String() throws ClassCastException
    {
        Object i=5;
        String a=(String)i;
        System.out.println(a);
    }

    public static  IOException iotest()throws IOException
    {
        throw new IOException();
    }
    public static void main(String[] args) {
        Integer a = new Integer(5);
        Integer b = null;
        try {
            System.out.println("a+b= "+Addition(a, b));
        } catch (NullPointerException e) {
            System.out.println("Error NullPointerException");
        }

        try
        {
            System.out.println("1/2="+Division(1,2));
            System.out.println("1/0="+Division(1,0));
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error ArithmeticException");
        }

        try
        {
            int[] z=new int[10];
            for(int i=0;i<10;i++)
            {
                z[i]=i;
            }
            System.out.println(Addition(z,0,10));
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error ArrayIndexOutOfBoundsException");
        }


        try {
            openfile("Name.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!!!!");
        }


        try
        {
            castingInt_String();
        }
        catch (ClassCastException e)
        {
            System.out.println("ClassCastException");
        }
        try
        {
            iotest();
        } catch (IOException e) {
            System.out.println("IOExeption");
        }
    }
}

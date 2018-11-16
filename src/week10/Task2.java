package week10;

import java.util.Random;

public class Task2 {

    public static void sort(int[] a)
    {
        Random random=new Random();
        for(int i=0;i<a.length;i++)
        {
            a[i]= random.nextInt();
        }
        for(int i=a.length-1;i>0;i--)
        {
            for(int k=0;k<i;k++)
            {
                if(a[k]>a[k+1])
                {
                    int z=a[k];
                    a[k]=a[k+1];
                    a[k+1]=z;
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] a=new int[1000];
        sort(a);
    }
}

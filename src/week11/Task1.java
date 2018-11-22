package week11;

import java.util.Random;

public class Task1 {
    public static  <T extends Comparable> void sort(T[] arr)
    {
        for(int i = arr.length-1; i>=0 ; i--)
        {
            for(int k=0;k<i;k++)
            {
                if(arr[k].compareTo(arr[k+1])>0)
                {
                    T z=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=z;
                }
            }
        }
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Integer A[]=new Integer[10];
        Random random=new Random();
        for(int i=0;i<10;i++)
        {
            A[i]=random.nextInt(10);
        }
        Task1.sort(A);
    }
}

package week11;

import java.util.Random;

public class Task2 {
    public static  <T extends Comparable> T max(T[] arr)
    {
        T max =arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if (max.compareTo(arr[i])<0)
            {
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] Int=new Integer[10];
        Random random=new Random();
        for(int i=0;i<10;i++)
        {
            Int[i]=random.nextInt(10);
            System.out.print(Int[i]+" ");
        }
        System.out.println("MAX INT = "+Task2.max(Int));
    }
}

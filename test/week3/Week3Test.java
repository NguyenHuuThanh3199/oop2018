package week3;

import org.junit.Test;
import static org.junit.Assert.*;

public class Week3Test {
    @Test
    // TODO: Viết 5 testcase cho phương thức max()
    public void testMax()
    {
        assertEquals(6,Week3.max(5, 6));      
        //assertEquals(-5,Week3.max(-5, -6));
    }
    @Test
    public void testMax1()
    {
        assertEquals(6,Week3.max(6, 5));
    }
    @Test
    public void testMax2()
    {
        assertEquals(10,Week3.max(10, 6));
    }
    @Test
    public void testMax3()
    {
        assertEquals(7,Week3.max(5, 7));
    }
    @Test
    public void testMax4()
    {
        assertEquals(9,Week3.max(5, 9));

    }
    @Test
    // TODO: Viết 5 testcase cho phương thức minOfArray()
    public void testminOfArray()
    {
        int [] a=new int[5];
        a[0]=6;
        a[1]=2;
        a[2]=84;
        a[3]=-4;
        a[4]=13;
        assertEquals(-4,Week3.minOfArray(a));
        
    }
    @Test
    public void testminOfArray1()
    {
        int [] a=new int[5];
        a[0]=6;
        a[1]=4;
        a[2]=8;
        a[3]=-5;
        a[4]=1;
        assertEquals(-5,Week3.minOfArray(a));
    }
    @Test
    public void testminOfArray2()
    {
        int [] a=new int[5];
        a[0]=6;
        a[1]=4;
        a[2]=8;
        a[3]=-5;
        a[4]=1;
        assertEquals(-5,Week3.minOfArray(a));
    }
    @Test
    public void testminOfArray3()
    {
        int [] a=new int[5];
        a[0]=3;
        a[1]=5;
        a[2]=3;
        a[3]=-5;
        a[4]=7;
        assertEquals(-5,Week3.minOfArray(a));
    }
    @Test
    public void testminOfArray4()
    {
        int [] a=new int[5];
        a[0]=6;
        a[1]=8;
        a[2]=22;
        a[3]=-51;
        a[4]=12;
        assertEquals(-51,Week3.minOfArray(a));
    }
    @Test
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    public void testcaculateMI()
    {       
        assertEquals("Thua can",Week3.calculateBMI(70,1.7));
        //assertEquals("Thieu can",Week3.calculateBMI(0, 0));
    }
    public void testcaculateMI1()
    {
        assertEquals("Beo phi",Week3.calculateBMI(80, 1.78));
    }
    public void testcaculateMI2()
    {
        assertEquals("Thua can",Week3.calculateBMI(70, 1.7));
    }
    public void testcaculateMI3()
    {
        assertEquals("Binh thuong",Week3.calculateBMI(55,1.7));
    }
    public void testcaculateMI4()
    {
        assertEquals("Thieu can",Week3.calculateBMI(52, 1.7));
    }
}

package week2.task2;

import static week2.task1.Task1.gcd;
public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator=numerator;
        this.denominator=denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction sum=new Fraction(1,1);
        sum.numerator=this.numerator*other.denominator+this.denominator*other.numerator;
        sum.denominator=this.denominator*other.denominator;
        sum.toigian();
        return sum;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction offset=new Fraction(1,1);
        offset.numerator=this.numerator*other.denominator-this.denominator*other.numerator;
        
        offset.denominator=this.denominator*other.denominator;
        offset.toigian();
        return offset;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction multi=new Fraction(1,1);
        multi.numerator=this.numerator*other.numerator;
        multi.denominator=this.denominator*other.denominator;
        multi.toigian();
        return multi;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction Divide=new Fraction(1,1);
        Divide.numerator=this.numerator*other.denominator;
        Divide.denominator=this.denominator*other.numerator;
        Divide.toigian();
        return Divide;
    }
    float b;
    int a=(int)b;
    public boolean equals(Object obj)
    {
        if (obj instanceof Fraction)
        {
            Fraction other=(Fraction) obj;
            if(this.denominator==0||other.denominator==0) return false;
            this.toigian();
            other.toigian();
            return (this.denominator==other.denominator)&&(this.numerator==other.numerator);
        }
        return false;
    }
    public void toigian()
    {
        int a=gcd(this.denominator,this.numerator);
        this.denominator=this.denominator/a;
        this.numerator=this.numerator/a;
    }
    public void out()
    {
        if(this.numerator==0) System.out.println("0");
        else 
        {
            System.out.println(this.numerator+ "/" +this.denominator+"\n");
        }
    }
    public static void main(String [] args)
    {
        Fraction a=new Fraction(8,16);
        Fraction b=new Fraction(2,2);
        Fraction c=new Fraction(1,1);
        System.out.print("a= ");
        a.out();
        System.out.print("b= ");
        b.out();
        c=a.multiply(b);
        System.out.print("a*b=");
        c.out();
        c=a.divide(b);
        System.out.print("a/b=");
        c.out();
        c=a.add(b);
        System.out.print("a+b=");
        c.out();
        c=a.subtract(b);
        System.out.print("a-b=");
        c.out();
        System.out.println("a==b: "+a.equals(b));
    }
            
}

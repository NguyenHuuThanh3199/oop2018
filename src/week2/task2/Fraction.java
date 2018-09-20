package week2.task2;

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
        return sum;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction offset=new Fraction(1,1);
        offset.numerator=this.numerator*other.denominator-this.denominator*other.numerator;
        offset.denominator=this.denominator*other.denominator;
        return offset;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction multi=new Fraction(1,1);
        multi.numerator=this.numerator*other.numerator;
        multi.denominator=this.denominator*other.denominator;
        return multi;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction Divide=new Fraction(1,1);
        Divide.numerator=this.numerator*other.denominator;
        Divide.denominator=this.denominator*other.numerator;
        return Divide;
    }
    public boolean equals(Fraction other)
    {
        return (this.numerator/this.denominator)==(other.numerator/other.denominator);
//        if(this.numerator/this.denominator==other.numerator/other.denominator)
//        {
//            return true;
//        }
//        return false;
    }
}

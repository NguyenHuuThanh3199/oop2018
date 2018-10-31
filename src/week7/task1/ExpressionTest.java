package week7.task1;

public class ExpressionTest {
    public static void main(String[] args) {
        try
        {
            System.out.println("Bieu thuc 1:");
            Square test=new Square(new Addition(new Subtraction(new Square(new Numeral(10)),new Numeral(1)),new Multiplication(new Numeral(2),new Numeral(3))));
            System.out.println(test.toString()+" = "+test.evaluate());
        }
        catch (ArithmeticException e)
        {
            System.out.println("Loi chia cho 0");
        }
        try
        {
            System.out.println("Bieu thuc 2:");
            Division test1=new Division(new Numeral(1),new Numeral(0));
            System.out.println(test1.toString());
            System.out.println(" = "+test1.evaluate());
        }
        catch (ArithmeticException e)
        {
            System.out.println("Loi chia cho 0");
        }

    }
}

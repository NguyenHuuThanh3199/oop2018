package week7.task1;

public class Numeral extends Expression{
    private int value=0;
    
    public Numeral (int value)
    {
        this.value = value;
    }

    public Numeral ()
    {

    }
    @Override
    public String toString() {
        String result=String.valueOf(value);
        return result;
    }

    @Override
    public int evaluate() {
        return value;
    }
}

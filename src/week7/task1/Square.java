package week7.task1;

public class Square extends Expression {

    private Expression expression;

    public Square(Expression expression)
    {
        this.expression=expression;
    }

    @Override
    public String toString() {
        String result="("+String.valueOf(this.expression)+")^2";
        return result;
    }

    @Override
    public int evaluate() {

        return this.expression.evaluate()*this.expression.evaluate();
    }
}

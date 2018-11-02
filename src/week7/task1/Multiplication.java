package week7.task1;

public class Multiplication extends BinaryExpression{

    private Expression left;
    private Expression right;

    public Multiplication(Expression left,Expression right)
    {
        this.right=right;
        this.left=left;
    }
    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }

    @Override
    public String toString() {
        return left.toString()+"*"+right.toString();
    }

    @Override
    public int evaluate() {
        return left.evaluate()*right.evaluate();
    }
}

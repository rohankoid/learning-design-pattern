package compositionpattern;

public class Division extends Operation {

    public Division(Composite left, Composite right)
    {
        super(left, right);
    }

    @Override
    public int eval()
    {
        int val = 1;
        int l;
        int r;

        l = this.leftChild.eval();
        r = this.rightChild.eval();

        val = l / r;

        return val;
    }

    @Override
    public void print()
    {
        System.out.print("( ");
        this.leftChild.print();
        System.out.print(" / ");
        this.rightChild.print();
        System.out.print(" )");
    }

}

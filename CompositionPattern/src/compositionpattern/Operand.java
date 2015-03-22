package compositionpattern;

public class Operand extends Composite {

    private String opdName;
    private int opdVal;

    public Operand(String opd, int val) {
        this.opdName = opd;
        this.opdVal = val;
    }

    public void changeVal(int val) {
        this.opdVal = val;
    }

    public int getVal() {
        return this.opdVal;
    }

    public String getOpd() {
        return this.opdName;
    }

    @Override
    public void print() {
        System.out.print(this.opdName);
    }

    @Override
    public int eval() {
        return this.opdVal;
    }

}

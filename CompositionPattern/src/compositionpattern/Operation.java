package compositionpattern;

public class Operation extends Composite {

    public Composite leftChild;
    public Composite rightChild;
    

    public Operation(Composite left, Composite right) {
        
        this.leftChild = left;
        this.rightChild = right;
    }
    
    public void setLeft(Composite child) {
        this.leftChild = child;
    }

    public void setRight(Composite child) {
        this.rightChild = child;
    }

    public Composite getLeft() {
        return this.leftChild;
    }

    public Composite getRight() {
        return this.rightChild;
    }

    @Override
    public int eval() {
        return 0;
    }

    @Override
    public void print() {
        System.out.print("");
    }
}

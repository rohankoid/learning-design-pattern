package compositionpattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rohan
 */
public class main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Operand o1 = new Operand("a", 8);
        Operand o2 = new Operand("b", 48);
        Operand o3 = new Operand("c", 6);

        Operation op1 = new Addition(o1, o2);
        Operation op2 = new Subtraction(o1, o3);
        Operation op3 = new Multiplication(op1, op2);

        op3.print();

        int result = op3.eval();

        System.out.println(" = " + result);

    }

}

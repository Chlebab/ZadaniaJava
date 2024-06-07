package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().sub(null,2));
        System.out.println(new Main().sub(1,null));
    }
    public int sub(Integer operand1, Integer operand2) {
        try {
            return operand1 - operand2;
        } catch (NullPointerException e) {
            if (operand1 == null) operand1 = 0;
            if (operand2 == null) operand2 = 0;
            return operand1 - operand2;
        }
    }
}
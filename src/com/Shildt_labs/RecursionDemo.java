package com.Shildt_labs;

public class RecursionDemo {
    public static void main(String[] args) {
        FactorialRec f=new FactorialRec();

        System.out.println("Вычисление рекурсивным методом");
        System.out.println("1!="+f.factR(1));
        System.out.println("3!="+f.factR(3));
        System.out.println("4!="+f.factR(4));
        System.out.println("5!="+f.factR(5));
        System.out.println();
        System.out.println("Вычисление итеративным методом");
        System.out.println("3!="+f.factI(3));
        System.out.println("4!="+f.factI(4));
        System.out.println("5!="+f.factI(5));
        System.out.println();
    }
}

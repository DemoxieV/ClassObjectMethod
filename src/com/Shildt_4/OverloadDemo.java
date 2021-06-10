package com.Shildt_4;

public class OverloadDemo {
    public static void main(String[] args) {
        Overload obj=new Overload();
        int resI;
        double resD;

        //Поочередный вызов всех версий метода ov1Demo()
        obj.ov1Demo();
        System.out.println();

        obj.ov1Demo(2);
        System.out.println();

        resI= obj.ov1Demo(4,6);
        System.out.println("Результат вызова obj.ov1Demo(4, 6): "+resI);
        System.out.println();

        resD= obj.ov1Demo(1.1,2.32);
        System.out.println("Результат вызова obj.ov1Demo(1.1, 2.32): "+resD);
    }
}

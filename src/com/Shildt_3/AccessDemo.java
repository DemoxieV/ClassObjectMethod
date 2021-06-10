package com.Shildt_3;

public class AccessDemo {
    public static void main(String[] args) {
        MyClass obj=new MyClass();

        //Доступ к переменной alpha возможен только с помощью специальных методов
        obj.setAlpha(-99);
        System.out.println("object Alpha: "+obj.getAlpha());

        //Обращение к переменной alpha напрямую недопустимо:
        //obj.alpha=10; //alpha закрытая переменная!

        //Переменные beta и gamma открытые, к ним можно обратиться напрямую
        obj.beta=88;
        obj.gamma=99;
    }
}

package com.Shildt_4;
//Использование статической переменной и переменной экземпляра класса StaticDemo
public class StatTestDemo {
    public static void main(String[] args) {
        StaticDemo obj1=new StaticDemo();
        StaticDemo obj2=new StaticDemo();

        obj1.x=10;
        obj2.x=20;
        StaticDemo.y=19;

        System.out.println("obj1.x = "+obj1.x+"\nobj2.x = "+obj2.x);
        System.out.println();

        System.out.println("Статическая переменная y = "+StaticDemo.y);
        System.out.println("obj1.x+y = "+obj1.sum());
        System.out.println("obj2.x+y = "+obj2.sum());
        System.out.println();

        StaticDemo.y=100;
        System.out.println("Новое значение переменной y = "+StaticDemo.y);
        System.out.println("obj1.x+y = "+obj1.sum());
        System.out.println("obj2.x+y = "+obj2.sum());
    }
}

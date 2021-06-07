package com.Shildt_labs;

public class ConsDemo {
    public static void main(String[] args) {
//  Значение по конструктору без параметров = 10 при создании объекта класса
        MyClass t1=new MyClass(10);
        MyClass t2=new MyClass(88);

        System.out.println(t1.x +" "+ t2.x);
    }
}

package com.Shildt_4;
//Перегрузка конструктора
public class OverloadConsDemo {
    public static void main(String[] args) {
        MyConstructor c1=new MyConstructor();
        MyConstructor c2=new MyConstructor(88);
        MyConstructor c3=new MyConstructor(17.23);
        MyConstructor c4=new MyConstructor(2,4);

        System.out.println("c1.x: "+c1.x);
        System.out.println("c2.x: "+c2.x);
        System.out.println("c3.x: "+c3.x);
        System.out.println("c4.x: "+c4.x);
    }
}

package com.Shildt_5;

public class NestedClassDemo {
    public static void main(String[] args) {
        int x[]={3,2,1,5,6,9,7,8};
        Outer outOb=new Outer(x);

        //Обращаемся к Inner-классу через метод объекта Outer-класса
        outOb.Analyze();
    }
}

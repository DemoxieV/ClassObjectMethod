package com.Vasiliev;

public class ConstructorDemo {
    public static void main(String[] args) {
        //Создание первого объекта через конструктор без аргументов
        InitClass objA=new InitClass();
        //Создание второго объекта через конструктор с 2мя параметрами
        InitClass objB=new InitClass(200, 'B');
        //Отображение значений полей первого объекта:
        System.out.println("Объект objA:");
        objA.show();
        //Отображение значений полей второго объекта:
        System.out.println("Объект objB:");
        objB.show();
    }
}

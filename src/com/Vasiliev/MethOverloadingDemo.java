package com.Vasiliev;

public class MethOverloadingDemo {
    public static void main(String[] args) {
        //Объявление объектных переменных:
        InitClass objA, objB;
        //Создание объектов:
        objA=new InitClass();
        objB=new InitClass();
        //Присваивание значений полям первого объекта (objA):
        objA.set(100);
        objA.set('A');
        //Отображение полей первого объекта (objA):
        System.out.println("Объект objA:");
        objA.show();
        //Присваивание значений полям второго объекта (objB):
        objB.set();
        //Отображение полей второго объекта (objB):
        objB.show("Объект objB");
        //Изменение значения полей второго объекта (objB):
        objB.set(200,'B');
        //Проверка значений полей второго объекта (objB):
        System.out.println("Объект objB после изменения:");
        objB.show("Число", "Символ");
    }
}

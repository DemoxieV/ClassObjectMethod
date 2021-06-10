package com.Vasiliev;

public class StaticMemDemo {
    public static void main(String[] args) {
        StaticMembers.show(); //Пока не создано ни одного объекта
        //При вызове конструктора для создания объекта будет срабатывать счётчик и вывод сообщения
        StaticMembers objA=new StaticMembers();
        StaticMembers objB=new StaticMembers();
        StaticMembers objC=new StaticMembers();
        System.out.println();
        //Вызов статического метода через ссылку на класс
        StaticMembers.show();
        System.out.println();
        //Вызов статического метода через ссылку на объект - необязательно
        objA.show();
        objB.show();
        objC.show();
    }
}

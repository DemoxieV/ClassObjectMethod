package com.Vasiliev;
//Класс со статическими членами
public class StaticMembers {
    static int count=0;

    StaticMembers(){
        count++;
        System.out.println("Создан объект номер "+count);
    }

    static void show(){
        System.out.println("Количество объектов: "+count);
    }
}

package com.Vasiliev;
//Класс с закрытыми членами
public class PrivateMembers {
    //Закрытое статическое поле
    private static int count=0;
    //Закрытые нестатические поля
    private int number;
    private String name;

    //Конструктор
    PrivateMembers(String n){
        count++;
        name = n;
        number = count;
        System.out.println("Создан объект с именем "+name);
    }

    //Метод для отображения сообщения
    public void show(){
        System.out.println("Название объекта: "+name);
        System.out.println("Номер объекта: "+number);
        System.out.println("Количество объектов: "+count);
    }

    //Метод для присваивания значения закрытому текстовому полю
    public void set(String n){
        name=n;
    }
}

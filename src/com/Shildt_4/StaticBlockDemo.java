package com.Shildt_4;
//Демонстрация работы статического блока, который выполняется до того, как будет создан объект класса
public class StaticBlockDemo {
    public static void main(String[] args) {
        StaticBlock obj=new StaticBlock("Внутри конструктора");

        System.out.println("Корень квадратный из 2 равен "+StaticBlock.rootOf2);
        System.out.println("Корень квадратный из 3 равен "+StaticBlock.rootOf3);
    }
}

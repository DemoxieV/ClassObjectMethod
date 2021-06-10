package com.Shildt_4;
//Автоматическое преобразование типов может влиять на выбор перегружаемого метода и выполняется лишь
//в отсутствии прямого соответствия типов параметра и аргумента.
public class Overload2 {
    void f(byte x){
        System.out.println("Внутри f(byte): "+x);
    }

    void f(int x){
        System.out.println("Внутри f(int): "+x);
    }

    void f(double x){
        System.out.println("Внутри f(double): "+x);
    }
}

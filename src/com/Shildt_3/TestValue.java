package com.Shildt_3;
//Простые типы данных передаются методам по значению
public class TestValue {
    int a,b;

    TestValue(int i, int j){
        a=i;
        b=j;
    }
    //Этот метод не может изменить значения аргументов, передаваемых ему при вызову
    void noChange(int i, int j){
        i=i+j;
        j=-j;
    }

    //Передача объекта методу. Переменные obj.a и obj.b будут изменяться
    void change(TestValue obj){
        obj.a=obj.a+obj.b;
        obj.b=-obj.b;
    }
}

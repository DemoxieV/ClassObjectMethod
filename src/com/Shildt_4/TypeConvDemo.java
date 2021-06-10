package com.Shildt_4;
//Автоматическое преобразование типов и перегрузка методов
public class TypeConvDemo {
    public static void main(String[] args) {
        Overload2 obj=new Overload2();

        int i=10;
        double d=10.1;

        byte b=99;
        short s=10;
        float f=11.5F;

        obj.f(i); //вызов метода obj.f(int)
        obj.f(d); //вызов метода obj.f(double)

//      obj.f(b); //вызов метода obj.f(int) с преобразованием типов до добавления метода в Overload2
        obj.f(b); //вызов метода obj.f(byte) с преобразованием типов после добавления метода в Overload2

        obj.f(s); //вызов метода obj.f(int) с преобразованием типов
        obj.f(f); //вызов метода obj.f(double) с преобразованием типов
    }
}

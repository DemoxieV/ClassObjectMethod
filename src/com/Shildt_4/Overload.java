package com.Shildt_4;
//Перегрузка методов
public class Overload {
    void ov1Demo(){
        System.out.println("Без параметров");
    }

    void ov1Demo(int a){
        System.out.println("Один параметр типа int: "+a);
    }

    int ov1Demo(int a, int b){
        System.out.println("Два параметра типа int: "+a+" "+b);
        return a+b;
    }

    double ov1Demo(double a, double b){
        System.out.println("Два параметра типа double: "+a+" "+b);
        return a+b;
    }
}

package com.Shildt_4;
//Демонстрация перегрузки конструкторов
public class MyConstructor {
    int x;

//Создание объектов разными способами через перегрузку конструктора
    MyConstructor() {
        System.out.println("Внутри MyConstructor()");
    }

    MyConstructor(int i) {
        System.out.println("Внутри MyConstructor(int)");
        this.x = i;
    }

    MyConstructor(double d){
        System.out.println("Внутри MyConstructor(double)");
        this.x = (int) d;
    }

    MyConstructor(int i, int j){
        System.out.println("Внутри MyConstructor(int, int)");
        x=i*j;
    }
}

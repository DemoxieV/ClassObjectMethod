package com.Shildt_3;
//Сравнение модификаторов доступа public и private,  см. AccessDemo
public class MyClass {
    private int alpha; // закрытый
    public int beta; // открытый
    int gamma; //тип по умолчанию (по существу public)

    //Методы доступа к переменной alpha. Члены класса могут обращаться только к закрытым членам того же класса
    void setAlpha(int a){
        alpha=a;
    }

    int getAlpha(){
        return alpha;
    }
}

package com.Shildt_2;
//Класс для вычисления целочисленной степени заданного числа
public class Pwr {
    double b;
    int e;
    double val;

    Pwr(double b, int e){
        //Ссылка на перменную экземляра, а не на параметр
        this.b=b;
        this.e=e;

        this.val=1;
        if(e==0) return;
        for (; e > 0; e--) val=val*b;
        }

        double get_pwr(){
        //this - ключевое слово, ссылается на объект, для которого был вызван метод
        return this.val;
        }
    }


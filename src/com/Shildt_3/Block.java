package com.Shildt_3;
//Методам можно передавать объекты
//Класс Block предназначен для хранения размеров параллелепопед в 3х измерениях
public class Block {
    int a,b,c;
    int volume;

    public Block(int i, int j, int k) {
        this.a = i;
        this.b = j;
        this.c = k;
        this.volume = a*b*c;
    }

    //Возврат true, если параметр ob определяет тот же параллелепипед
    //Используем объект в качестве параметра метода
    boolean sameBlock(Block ob){
        if((ob.a==a) & (ob.b==b) & (ob.c==c)) return true;
        else return false;
    }

    //Возврат true, если параметр ob параллелепипед того же объема (volume)
    //Используем объект в качестве параметра метода
    boolean sameVolume(Block ob){
        if(ob.volume == volume) return true;
        else return false;
    }
}

package com.Shildt_4;
//Инициализация одного объекта посредством другого
public class Summation {
    int sum;

    //Создание объекта на основе целочисленного значения
    Summation(int num){
        this.sum=0;
        for (int i = 1; i <= num; i++) {
            sum+=i;
        }
    }

    Summation(Summation obj){
        sum=obj.sum;
    }
}

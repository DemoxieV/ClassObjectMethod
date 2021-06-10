package com.Shildt_labs;
//Простой пример рекурсии
public class FactorialRec {
    //Рекурсивный метод factR()
    int factR(int n){
        int result;

        if(n==1) return 1;
        result=factR(n-1)*n;
        return result;
    }

    //Итеративный способ вычисление факториала
    int factI(int n){
        int t, result;

        result=1;
        for (t = 1; t <=n; t++) result*=t;
        return result;
    }
}

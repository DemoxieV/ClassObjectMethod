package com.Shildt_2;
//Определить, является ли первый параметр делителем второго
public class Factor {
    boolean isFactor(int a, int b){
        if((b%a) == 0) return true;
        else return false;
    }
}

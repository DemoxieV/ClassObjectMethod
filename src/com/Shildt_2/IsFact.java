package com.Shildt_2;

public class IsFact {
    public static void main(String[] args) {
        Factor x=new Factor();
        if(x.isFactor(2,20)) System.out.println("2 - делитель");
        if (x.isFactor(3,20)) System.out.println("Эта строка не будет выведена");
    }
}

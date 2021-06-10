package com.Vasiliev;

public class PrivateMemDemo {
    public static void main(String[] args) {
        PrivateMembers objA=new PrivateMembers("Alpha");
        PrivateMembers objB=new PrivateMembers("Bravo");
        PrivateMembers objC=new PrivateMembers("Charlie");

        objA.show();
        objB.show();
        objC.show();

        objB.set("Второй объект");
        objB.show();

    }
}

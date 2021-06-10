package com.Shildt_4;

public class StatTestDemo2 {
    public static void main(String[] args) {
        System.out.println("Значение val: "+StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(): "+StaticMeth.valDiv2());

        StaticMeth.val=4;
        System.out.println("Значение val: "+StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(): "+StaticMeth.valDiv2());
    }
}

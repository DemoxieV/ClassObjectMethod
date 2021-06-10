package com.Shildt_3;

public class ErrInfoDemo {
    public static void main(String[] args) {
        ErrorInfo err=new ErrorInfo();
        Err e;

        e=err.getErrorInfo(2);
        System.out.println(e.msg+" уровень: "+e.severity);

        e=err.getErrorInfo(19);
        System.out.println(e.msg+" уровень: "+e.severity);
    }
}

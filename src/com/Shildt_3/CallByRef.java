package com.Shildt_3;
//вызов по ссылке
public class CallByRef {
    public static void main(String[] args) {
        TestValue obj=new TestValue(15,20);

        System.out.println("obj.a и obj.b перед вызовом: "+obj.a+" "+obj.b);
        obj.change(obj);
        System.out.println("obj.a и obj.b после вызова: "+obj.a+" "+obj.b);
    }
}

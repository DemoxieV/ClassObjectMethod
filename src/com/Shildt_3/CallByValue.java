package com.Shildt_3;
//вызов по значению, см.TestValue
public class CallByValue {
    public static void main(String[] args) {
        int a=15, b=20;
        TestValue obj=new TestValue(a,b);

        System.out.println("a и b перед вызовом: "+a+" "+b);
        obj.noChange(a,b);
        System.out.println("a и b после вызова: "+a+" "+b);
    }
}
// Действия, выполняемые в теле метода noChange() не влияют на значения переменных a и b
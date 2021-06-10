package com.Shildt_5;
//Демонстрация использования метода с переменным числом аргументов
public class VarArgs {
    //Метод vaTest() допускает переменное число аргументов
    static void vaTest(int ... v){
        if(v.length==0) {
            System.out.println("Количество аргументов: "+v.length);
            System.out.println("Содержимое: тут пусто");
        }else {
            System.out.println("Количество аргументов: " + v.length);
            System.out.println("Содержимое: ");
        }

        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg "+i+": "+v[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //Метод vaTest() может вызываться с переменным числом аргументов
        vaTest(10);
        vaTest(1,2,3);
        vaTest();
    }
}

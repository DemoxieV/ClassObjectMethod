package com.Shildt_5;
/* Перегрузка метода с переменным числом аргументов и неоднозначность в выборе перегруженной версии.
* В этой программе имеется ошибка, и поэтому она не будет компилироваться. Ошибка закомментирована.*/
public class VarArgs4 {
    static void vaTest(int...v){
        System.out.println("vaTest(int...):"+v.length);
        System.out.println("Содержимое: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg "+i+": "+v[i]);
        }
        System.out.println();
    }

    static void vaTest(boolean...v){
        System.out.println("vaTest(boolean...): "+"Количество аргументов: "+v.length);
        System.out.println("Содержимое: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg "+i+": "+v[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1,2,3); //OK
        vaTest(true,false,true); //OK
//        vaTest(); // Ошибка: неоднозначность вызова!
    }
}

package com.Shildt_labs;

public class Help {

    void showmenu() {
        System.out.println("Справка:");
        System.out.println("\t1. if");
        System.out.println("\t2. switch");
        System.out.println("\t3. for");
        System.out.println("\t4. while");
        System.out.println("\t5. do-while");
        System.out.println("\t6. break");
        System.out.println("\t7. continue\n");
        System.out.print("Выберите номер раздела (q-выход из программы): ");
    }

    boolean isvalid(int ch) {
        if (ch < '1' | ch > '7') return false;
        else return true;
    }
//     & ch != 'q'

    void helpon(int what) {
        switch (what) {
            //Важно: константа при case символьное значение - берем в символьные литералы
            case '1':
                System.out.println("Инструкция if:\n");
                System.out.println("if(условие) инструкция;");
                System.out.println(" else инструкция;");
                break;
            case '2':
                System.out.println("Инструкция switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println(" case константа:");
                System.out.println(" последовательность инструкций;");
                System.out.println(" break;");
                System.out.println(" // ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("Цикл for:\n");
                System.out.print("for (инциализация; условие; итерация)");
                System.out.println(" инструкция;");
                break;
            case '4':
                System.out.println("Цикл while:\n");
                System.out.println(" while(условие) инструкция;");
                break;
            case '5':
                System.out.println("Цикл do-while:\n");
                System.out.println("do {");
                System.out.println(" инструкции;");
                System.out.println("} while (условие);");
                break;
            case '6':
                System.out.println("Инструкция break:\n");
                System.out.println("break; или break метка;");
                break;
            case '7':
                System.out.println("Инструкция continue:");
                System.out.println("continue; или continue метка;");
                break;
        }
        System.out.println();
    }
}


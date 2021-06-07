package com.Shildt_labs;
//Реализация справочной системы
public class HelpClassDemo {
    public static void main(String[] args) throws java.io.IOException {
        char choice;
        char ignore;
        Help obj = new Help();

        for(;;) {
            do {
                obj.showmenu();
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
                obj.helpon(choice);
            }while(obj.isvalid(choice));
//            obj.helpon(choice);
            if(choice =='q') break;
        }


    }
}

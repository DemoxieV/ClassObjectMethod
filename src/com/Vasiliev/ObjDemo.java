package com.Vasiliev;
import javax.swing.JOptionPane;
public class ObjDemo {
    public static void main(String[] args) {
        // Создание объекта класса InitClass
        InitClass obj=new InitClass();
        // Присваивание значения полям объекта:
        obj.number=100;
        obj.symbol='A';
        // Вывод и отображение диалогового окна
        String text="Число "+obj.number+"\n";
        text+="Символ: "+obj.symbol+"\n";
        JOptionPane.showMessageDialog(null, text);
    }
}

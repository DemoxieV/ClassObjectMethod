package com.Vasiliev;
import javax.swing.JOptionPane;
public class ObjMethDemo {
    public static void main(String[] args) {
        InitClass objA=new InitClass();
        InitClass objB=new InitClass();

        //Присваивание значений полям объектов:
        objA.set(100,'A');
        objB.set(200,'B');
        //Отображение диалоговых окон со значениями полей объектов
        JOptionPane.showMessageDialog(null,objA.getInfo(), "Первый объект",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,objB.getInfo(), "Второй объект",JOptionPane.INFORMATION_MESSAGE);
    }
}

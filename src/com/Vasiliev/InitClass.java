package com.Vasiliev;

public class InitClass {
    // Поля класса:
    int number;
    char symbol;

    // Перегрузка конструкторов
    // Конструктор класса без аргументов:
    public InitClass() {
        //Присваивание значений полям
        number=150;
        symbol='C';
    }

    // Конструктор класса с 2мя параметрами:
    public InitClass(int n, char s) {
        this.number = n;
        this.symbol = s;
    }

    // Перегрузка методов - механизм описания нескольких методов с одинаковым названием
    // Перегрузка методов для присваивания значений полям:
    void set(int n, char s){ // Методы с одним аргументом вызываются через метод с 2мя аргументами
//        number=n;
        //Вызываем метод set(int n)
        set(n);
//        symbol=s;
        //Вызываем метод set(char s)
        set(s);
    }

    void set(int n){
        number=n;
    }

    void set(char s){
        symbol=s;
    }

    void set(){
        // конкретные значения полей:
        set(0,'Z');
    }

    // Перегрузка методов для отображения значений полей объекта
    void show(){
        System.out.println("Значения полей "+number+" и "+symbol);
    }

    void show(String txt){
        System.out.println(txt+": значения полей "+number+" и "+symbol);
    }

    void show(String txt1, String txt2){
        System.out.println(txt1+": "+number);
        System.out.println(txt2+": "+symbol);
    }

    //Метод для возврата текстовой строки с описанием объекта:
    String getInfo(){
        String text="Число "+number+"\n";
        text+="Символ: "+symbol+"\n";
        return text;
    }
}

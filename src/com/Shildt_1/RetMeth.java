package com.Shildt_1;
//Использование возвращаемого значения
public class RetMeth {
    public static void main(String[] args) {
        Vehicle minivan=new Vehicle(7,16,21);
        Vehicle sportscar=new Vehicle(2,14,12);

        int range1, range2;
        // Присваивание значений переменным экземпляра (объект minivan, точечная нотация)
//        minivan.passengers=7;
//        minivan.fuelcap=16;
//        minivan.mpg=21;

        // Присваивание значений переменным экземпляра (объект sportscar, точечная нотация)
//        sportscar.passengers=2;
//        sportscar.fuelcap=14;
//        sportscar.mpg=12;

        // Вызов метода range с возвратом значения
//        range1= minivan.range();
//        range2= sportscar.range();

        System.out.println("Мини-фургон может перевезти "+minivan.passengers+" пассажиров на расстояние "+minivan.range()+" миль.");
        System.out.println("Спортивный автомобиль может перевезти "+sportscar.passengers+" пассажиров на расстояние "+sportscar.range()+" миль.");

        //сравнение дальности двух транспортных средств
        if(minivan.range() > sportscar.range()) System.out.println("minivan > sportscar");
    }
}

package com.Shildt_1;

public class TwoVehicles {
    public static void main(String[] args) {
        // Переменные minivan и sportscar ссылаются на разные объекты
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

        //Расчет дальности поездки с полным баком горючего
        range1=minivan.fuelcap*minivan.mpg;
        range2=sportscar.fuelcap* sportscar.mpg;

        System.out.println("Мини-фургон может перевезти "+minivan.passengers+" пассажиров на расстояние "+range1+" миль.");
        System.out.println("Спортивный автомобиль может перевезти "+sportscar.passengers+" пассажиров на расстояние "+range2+" миль.");
    }
}

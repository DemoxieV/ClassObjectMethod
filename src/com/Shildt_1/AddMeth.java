package com.Shildt_1;

public class AddMeth {
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

        System.out.println("Мини-фургон может перевезти "+minivan.passengers+" пассажиров.");
        minivan.range();
        System.out.println("Спортивный автомобиль может перевезти "+sportscar.passengers+" пассажиров.");
        sportscar.range();
    }
}

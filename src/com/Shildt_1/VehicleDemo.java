package com.Shildt_1;

public class VehicleDemo {

    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        int range;

        // Присваивание значений переменным экземпляра (объект minivan, точечная нотация)
//        minivan.passengers=7;
//        minivan.fuelcap=16;
//        minivan.mpg=21;

        //Расчет дальности поездки с полным баком горючего
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Мини-фургон может перевезти " + minivan.passengers + " пассажиров на расстояние " + range + " миль");
    }
}

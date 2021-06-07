package com.Shildt_1;

public class Vehicle {
    int passengers; //кол-во пассажиров
    int fuelcap; //емкость топливного бака
    int mpg; //потребление топлива в милях на галлон

    public Vehicle(int p, int f, int m) {
        this.passengers = p;
        this.fuelcap = f;
        this.mpg = m;
    }

    //Добавляем метод для расчета дальности поездки в класс транспортного средства
    int range(){
        return mpg*fuelcap; // возврат дальности поездки для заданного средства
//        System.out.println("Дальность - "+fuelcap*mpg+" миль.");
    }
    //параметризированный метод расчета объема топлива для преодоления заданного расстояния
    double fuelneeded(int miles){
        return (double) miles/mpg;
    }
}

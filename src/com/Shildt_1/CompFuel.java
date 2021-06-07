package com.Shildt_1;

public class CompFuel {
    public static void main(String[] args) {
        Vehicle minivan=new Vehicle(7,16,21);
        Vehicle sportscar=new Vehicle(2,14,12);
        double gallons;
        int dist=252;

        // Присваивание значений переменным экземпляра (объект minivan, точечная нотация)
//        minivan.passengers=7;
//        minivan.fuelcap=16;
//        minivan.mpg=21;

        // Присваивание значений переменным экземпляра (объект sportscar, точечная нотация)
//        sportscar.passengers=2;
//        sportscar.fuelcap=14;
//        sportscar.mpg=12;

        gallons=minivan.fuelneeded(dist);
        System.out.println("Для преодоления "+dist+ " миль мини-фургону требуется "+gallons+" галлонов топлива");

        gallons=sportscar.fuelneeded(dist);
        System.out.println("Для преодоления "+dist+ " миль спортивному автомобилю требуется "+gallons+" галлонов топлива");
    }
}

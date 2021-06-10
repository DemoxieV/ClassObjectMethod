package com.Shildt_5;
//Применение внутреннего класса
public class Outer {
    int nums[];

    Outer(int n[]){
        nums=n;
    }

    void Analyze(){
        //Создаем объект, через который обращаемся к членам класса Inner
        Inner inOb=new Inner();

        System.out.println("Минимум: "+inOb.min());
        System.out.println("Максимум: "+inOb.max());
        System.out.println("Среднее: "+inOb.avg());
    }

    //Внутренний (локальный) класс
    class Inner{
        int min(){
            int m=nums[0];
            for (int i = 1; i < nums.length; i++) {
                if(nums[i]<m) m=nums[i];
            }
            return m;
        }

        int max(){
            int m=nums[0];
            for (int i = 1; i < nums.length ; i++) {
                if(nums[i]>m) m=nums[i];
            }
            return m;
        }

        int avg(){
            int a=0;
            for (int i = 0; i < nums.length; i++) {
                a+=nums[i];
            }
            return a/nums.length;
        }
    }
}

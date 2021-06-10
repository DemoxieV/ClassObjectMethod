package com.Shildt_labs;
//Создание класса очереди - "первым пришел, первым обслужен"
public class Queue {
    private char q[]; // массив для хранения элементов очереди
    private int putloc, getloc; //индексы для вставки и извлечения элементов очереди

//Конструктор класса Queue создает очередь заданного размера
    Queue(int size) {
        q = new char[size+1]; // выделение памяти для очереди
        putloc = getloc = 0; //исходное значение индексов равно нулю - сейчас в очереди нет элементов
    }

//Создание очереди на основе имеющегося объекта Queue
    Queue(Queue obj){
        putloc= obj.putloc;
        getloc= obj.getloc;
        q=new char[obj.q.length];

        //В учебнике int i = getloc+1...
        //Копирование элементов из объекта obj в очередь
        for (int i = getloc; i <= putloc; i++) {
            q[i]=obj.q[i];
        }
    }

//Создание очереди на основе массива исходных значений
    //Длина очереди больше на 1 элемент, чем длина исходного массива
    Queue(char a[]){
        putloc=0;
        getloc=0;
        q=new char[a.length+1];

        for (int i = 0; i < a.length; i++) {
            put(a[i]);
        }
    }

//Помещение символа в очередь
    void put(char ch){
        if(putloc==q.length-1){ //Проверка - не переполнена ли очередь
            System.out.println(" - Очередь заполнена");
            return;
        }
        q[putloc++]=ch; //если очередь не заполнена, то индекс извлечения инкрементируется
    }

//Извлечение символа из очереди
    char get(){
        if (getloc==putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        return q[getloc++];
    }
}

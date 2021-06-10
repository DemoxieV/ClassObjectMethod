package com.Shildt_3;
//Возврат объекта, определяемого разработчиком программы
public class Err {
    String msg; //сообщение об ошибке
    int severity; //уровень серьезности ошибки

    Err (String m, int s){
        msg=m;
        severity=s;
    }
}

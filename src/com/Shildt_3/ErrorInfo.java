package com.Shildt_3;

public class ErrorInfo {
    String msgs[]={
            "Ошибка ввода",
            "Ошибка вывода",
            "Отсутствует место на диске",
            "Выход за границы диапазона"
    };
    int howbad[]={3,3,2,4};

    Err getErrorInfo(int i){ //Возврат объекта класса (типа) Err
        if(i >=0 & i<msgs.length)
            return new Err(msgs[i], howbad[i]);
        else return new Err("Несуществующий код ошибки",0);
    }
}

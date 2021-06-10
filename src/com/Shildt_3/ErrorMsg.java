package com.Shildt_3;
//Возврат объекта типа String
public class ErrorMsg {
    String msgs[]={
            "Ошибка ввода",
            "Ошибка вывода",
            "Отсутствует место на диске",
            "Выход за границы диапазона"
    };

    //Возврат сообщения об ошибке
    String getErrorMsg(int i){ //Возврат объекта типа String
        if(i >= 0 & i < msgs.length)
            return msgs[i];
        else
            return "Несуществующий код ошибки";
    }
}

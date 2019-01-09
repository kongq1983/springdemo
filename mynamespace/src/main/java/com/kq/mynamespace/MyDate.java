package com.kq.mynamespace;

import java.text.SimpleDateFormat;

/**
 * MyDate
 *
 * @author kq
 * @date 2019/1/9
 */
public class MyDate {

    private SimpleDateFormat dateFormat;

    public MyDate(SimpleDateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String toString(){
        return dateFormat.toString()+" pattern="+dateFormat.toPattern();
    }



}

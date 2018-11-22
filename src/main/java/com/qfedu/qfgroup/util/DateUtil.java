package com.qfedu.qfgroup.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *@Author feri
 *@Date Created in 2018/11/22 09:54
 */
public class DateUtil {

    public static String getDate(){
        return new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
    }
}

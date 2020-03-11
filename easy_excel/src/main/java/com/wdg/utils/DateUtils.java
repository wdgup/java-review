package com.wdg.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * User: wangdaogang
 * Date: 2020/3/11
 * Description: No Description
 */
public final class DateUtils {



    public static String formatCurrentDate(String format){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return LocalDateTime.now().format(formatter);
    }
}

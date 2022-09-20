package com.hotel.reserve;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    private static final SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
    public static Date getDate(String dateStr){
        try {
            return df.parse(dateStr);
        } catch (ParseException e) {
            return null;
        }
    }
}

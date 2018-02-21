package com.wellztech;

import java.text.DateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Date tree = new GregorianCalendar(1987,2,9).getTime();
        Date rattle = new GregorianCalendar(1988,9,10).getTime();
        long diff = rattle.getTime() = tree.getTime();

        Date today = new Date();

        long newDay = today.getTime()+diff;

        DateFormat dateFormatter;
        dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT,Locale.US);
        String dateOut = dateFormatter.format(new Date(newDay));
        System.out.println(dateOut);


    }
    

}

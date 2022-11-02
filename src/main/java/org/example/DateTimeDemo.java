package org.example;

import java.time.LocalDate;

public class DateTimeDemo {

    public static void main(String[] args) {
        ex1();

    }

    public static void ex1(){

        LocalDate currentDate = LocalDate.now();
        System.out.println("current date: " + currentDate);
        System.out.println(currentDate.getYear());
        System.out.println(currentDate.getDayOfWeek());
        System.out.println(currentDate.getChronology());

        LocalDate newDate = currentDate.plusDays(2);
        System.out.println(newDate);

    }

}

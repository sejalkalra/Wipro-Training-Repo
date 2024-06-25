package com.java_time_week_day_4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.util.Scanner;

public class WeekCalculator_4 {

    public static String WeekDays (String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        LocalDate localDate = LocalDate.parse(date, formatter);
        
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        
        return dayOfWeek.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String date = sc.nextLine();
        
        String day_Week = WeekDays(date);
        
        System.out.println("Day week for " + date + " is " + day_Week);
        
    }
}

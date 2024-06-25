package com.java_time_age_3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculation_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birthdate (yyyy-MM-dd): ");
        String birth_date = sc.nextLine();

        DateTimeFormatter date_Format = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate birthdate = LocalDate.parse(birth_date, date_Format);

        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthdate, currentDate);

        System.out.println("You are " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days old.");

    }
}

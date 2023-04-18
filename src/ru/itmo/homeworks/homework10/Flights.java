package ru.itmo.homeworks.homework10;

import java.time.LocalDateTime;
import java.time.Month; // содержит все месяцы
import java.time.format.DateTimeFormatter;

public class Flights {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        System.out.println(current);

        LocalDateTime dateTime01 = LocalDateTime.of(2023, Month.JUNE, 16, 19, 0);
        System.out.println(dateTime01);

        String dateTime02 = "2008-06-11T10:00";
        LocalDateTime parseDate = LocalDateTime.parse(dateTime02);
        System.out.println(parseDate);
        dateTime02 = "01 апреля 2023 в 16 24";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy в HH mm");
        parseDate = LocalDateTime.parse(dateTime02, dtf);
        System.out.println(parseDate);



    }
}

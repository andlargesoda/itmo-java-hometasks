package ru.itmo.homeworks.homework10;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ZoneDateTime {
    public static void getZoneDescription() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy в HH:mm");
        List<String> zones = new ArrayList<>(ZoneId.getAvailableZoneIds());
        zones.forEach(System.out::println);
    }
}

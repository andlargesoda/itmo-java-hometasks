package ru.itmo.homeworks.homework18;

import java.util.Comparator;

public class PriceComparator implements Comparator<Course> {
    public int compare(Course o1, Course o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }
}
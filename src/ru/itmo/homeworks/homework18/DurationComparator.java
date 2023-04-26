package ru.itmo.homeworks.homework18;

import java.util.Comparator;

public class DurationComparator implements Comparator<Course> {
    public int compare(Course o1, Course o2) {
        return (int) (o1.getDuration() - o2.getDuration());
    }
}
package ru.itmo.homeworks.homework18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        University university = new University();

        Course course01 = new Course("Python", 4, 15000);
        Course course02 = new Course("Java", 3, 18000);
        Course course03 = new Course("C", 6, 19000);
        Course course04 = new Course("C++", 6, 18000);
        Course course05 = new Course("Swift", 2, 17000);

        List<Course> courses = new ArrayList<>(Arrays.asList(course01, course02, course03, course04, course05));

        university.addCourses(courses);
        System.out.println(courses);

        // Predicate для удаления курсов (тип Course) с названием python
        Predicate<Course> coursePredicate01 = course -> course.getName() == "Python";
        courses.removeIf(coursePredicate01);
        System.out.println(courses);

        // Predicate для удаления курсов (тип Course) продолжительностью меньше 3 месяцев и стоимостью меньше 20000
        double maxPrice = 20000.0;
        Predicate<Course> coursePredicate02 = course -> course.getDuration() < 3 && course.getPrice() < maxPrice;
        courses.removeIf(coursePredicate02);
        System.out.println(courses);

        // Function для добавления к положительному числу строки " p."
        String currency = " р.";
        Function<Course, String> courseFunction = course -> course.getPrice() + currency;
        System.out.println(courses);

        // PriceComparator<Course> priceComparator = new PriceComparator().thenComparing(new DurationComparator());
        // Collections.sort(courses, priceComparator);
    }
}

package ru.itmo.homeworks.homework13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        System.out.println(countries);
        countries.add("Rus");
        System.out.println(countries);
        countries.add("USA");
        System.out.println(countries);
        System.out.println(countries.size()); // 2
        countries.add(1, "China");
        System.out.println(countries);
        countries.set(2, "Jap");
        System.out.println(countries);

        for (String country : countries) {
            System.out.println(country);
        }

        Iterator<String> iterator01 = countries.iterator();
        while (iterator01.hasNext()) { // hasNext возвращает True до тех пор пока есть элементы в коллекци, если false, то цикл While завершит свою работу
            iterator01.next();
            iterator01.remove();
            System.out.println(countries);
        }
        System.out.println(iterator01); // []

        if (countries.contains("Jap")) System.out.println("ok");
        System.out.println(countries.contains("Jap"));
        System.out.println(countries.contains("China"));
        System.out.println(countries.remove("China"));
        if (countries.remove("USA")) System.out.println("okee");
        System.out.println(countries.remove("China"));

        ArrayList<String> user = new ArrayList<>(5);
        System.out.println(user.size());

//        ArrayList<String> user01 = new ArrayList<>(countries<>);

        LinkedList<String> user03 = new LinkedList<>();
        user03.add("2342");
        user03.add("23");
        user03.add("2343");
        System.out.println(user03.size());
        System.out.println(user03.getFirst());
        System.out.println(user03.getLast());
        System.out.println(user03.get(1));
    }
}

package ru.itmo.homeworks.homework07;

public class Application {
    public static void main(String[] args) {

        // при создании объекта через родительский класс методы дочернего не применяются
        Transport train01 = new Train(1, 2);
        // System.out.println(train01.getNumberOfWagons);
        System.out.println(train01.getDamageLevel());
        train01.setDamageLevel(3);
        System.out.println(train01.getDamageLevel());
        train01.fixDamageLevel();
        System.out.println(train01.getDamageLevel());
        System.out.println();

        Train train02 = new Train(2, 3);
        System.out.println(train02.getNumberOfWagons());
        System.out.println(train02.getDamageLevel());
        train02.setDamageLevel(5);
        train02.addWagon();
        System.out.println(train02.getDamageLevel());
        System.out.println(train02.getNumberOfWagons());
        train02.fixDamageLevel();
        System.out.println(train02.getDamageLevel());

    }
}

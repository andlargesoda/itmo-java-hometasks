package ru.itmo.homeworks.homework07;

public class Application {
    public static void main(String[] args) {
        Train train01 = new Train(5, 5);
        System.out.println(train01.getDamageLevel());
        train01.setDamageLevel(2);
        System.out.println(train01.getDamageLevel());
        train01.fixDamageLevel();
        System.out.println(train01.getDamageLevel());
        train01.addWagon();
        System.out.println(train01.getNumberOfWagons());
        System.out.println(train01.getColor());

        Bus bus01 = new Bus(6, "коричневый");
        System.out.println(bus01.isWifiAccess());
        bus01.setWifiAccess(true);
        bus01.setDamageLevel(5);
        System.out.println(bus01.getDamageLevel());
        System.out.println(bus01.isWifiAccess());
        bus01.fixDamageLevel();
        System.out.println(bus01.getDamageLevel());
        System.out.println(bus01.isWifiAccess());

        Transport train02 = new Train(2,2);
        Transport bus02 = new Bus(2,"rhf");
    }
}

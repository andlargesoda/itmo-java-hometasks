package ru.itmo.homeworks.homework07;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Train train01 = new Train(1,5);
        Train train02 = new Train(2,5);
        Train train03 = new Train(3,5);
        Train train04 = new Train(4,5);

        // объявление объектов автобус
        Bus bus01 = new Bus(1, "белый");
        Bus bus02 = new Bus(2, "бирюзовый");
        Bus bus03 = new Bus(3, "желтый");

        // объявление объектов автомобиль
        Car car01 = new Car(1);
        car01.paintable("коричневый");
        Car car02 = new Car(2);
        Car car03 = new Car(3);
        // Car car04 = new Car(3); // проверка переполнения массива транспортных средств

        // присвоение уровня износа
        train01.setDamageLevel(2);
        train02.setDamageLevel(4);
        train03.setDamageLevel(6);
        train03.setDamageLevel(8);
        bus01.setDamageLevel(3);
        bus02.setDamageLevel(6);
        bus03.setDamageLevel(9);
        car01.setDamageLevel(1);
        car01.setDamageLevel(5);
        car01.setDamageLevel(10);

        // объявление объекта сервис
        Service service = new Service();

        // добавление транспорта в массив
        service.addTransport(train01);
        service.addTransport(train02);
        service.addTransport(train03);
        service.addTransport(train04);
        service.addTransport(bus01);
        service.addTransport(bus02);
        service.addTransport(bus03);
        service.addTransport(car01);
        service.addTransport(car02);
        service.addTransport(car03);

        service.fixTransport();
        service.printTransports();
        System.out.println(train01.getDamageLevel());
        System.out.println(train01.getColor());
        System.out.println(car01.getColor());
    }
}

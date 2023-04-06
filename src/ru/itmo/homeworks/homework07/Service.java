package ru.itmo.homeworks.homework07;

import java.awt.*;

public class Service {
    private Transport[] transports;
    private String[] colors = {"белый", "серый", "синий", "красный", "черный", "оливковый", "желтый"};
    private int indexTransport;
    private int indexColor;

    public Service() {
        transports = new Transport[10];
    }

    public void addTransport(Transport transport) {
        if (transport == null) {
            System.out.println("Не указан транспорт");
            return;
        }
        if (transports.length == indexTransport) {
            System.out.println("Мастерская заполнена");
            return;
        } else {
            System.out.println("Транспорт № " + transport.getNumber() + " добавлен в мастерскую. Уровень износа: " + transport.getDamageLevel());
        }
        transports[indexTransport] = transport;
        indexTransport++;
    }

    public void printTransports() {
        for (Transport transport : transports) {
            System.out.println("Транспорт № " + transport.getNumber() + " отремонтирован. Уровень износа: " + transport.damageLevel);
        }
    }

    public void fixTransport() {
        for (indexTransport = 0; indexTransport < transports.length; indexTransport++) {
            transports[indexTransport].fixDamageLevel();
            if (transports[indexTransport] instanceof Paint) {
                ((Paint) transports[indexTransport]).paintable(colors[(int) (Math.random() * colors.length)]);
            }
//            indexTransport++;
        }
    }
}

package ru.itmo.homeworks.homework07;

import java.awt.*;
// нужна ли имплементация интерфейса, чтобы вызывать абстрактный метод покраски авто при применении метода ремонта транспорта из массива
public class Service {
    private Transport[] transports;
    private String[] colors = {"красный", "оранжевый", "красный"};
    private int indexTransport;
    private int indexColor;
    public Service() {
        transports = new Transport[10];
    }

    // метод добавления транспортного средства в массив
    // на данный момент метод не вызывается в main
    public void addTransport(Transport transport) {
        if (transport == null){
            System.out.println("Не указан транспорт");
            return;
        }
        if (transports.length == indexTransport) {
            System.out.println("Мастерская заполнена");
        } else {
            System.out.println(transport.getNumber() + " добавлен в мастерскую");
        }
    }
    // метод ремонта транспортных средств массива
    public void fixTransport(Transport transport) {
        transports[indexTransport].fixDamageLevel();
    }
}

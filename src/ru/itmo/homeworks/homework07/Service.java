package ru.itmo.homeworks.homework07;

import java.awt.*;

public class Service {
    private Transport[] transports;
    private String[] colors = {"красный", "оранжевый", "красный"};
    private int indexTransport;
    private int indexColor;
    public Service() {
        transports = new Transport[10];
    }
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

}

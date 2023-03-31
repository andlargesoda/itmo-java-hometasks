package ru.itmo.homeworks.homework6.hikes;

import java.util.Arrays;

public class Group {
    private Mountain mountain;
    private Climber[] climbers;
    private int index;
    private boolean isOpen;

    public Group(Mountain mountain) {
        this.mountain = mountain;
        this.isOpen = true;
        climbers = new Climber[5];
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public void addClimber(Climber climber) { // при вызове данного метода в Application в () необходимо указать массив альпинистов, открытость набора в группу)
        if (climbers == null) {
            System.out.println("Не указан альпинист");
            return;
        }
        if (climbers.length == index) {
            System.out.println("Группа заполнена");
        }
        if (isOpen) {
            climbers[index] = climber;
            index++;
            System.out.println(climber.getNameClimber() + " добавлен в группу на гору " + mountain.getNameMountain());
        } else {
            System.out.println(climber.getNameClimber() + " не добавлен в группу на гору " + mountain.getNameMountain() + " , т.к. набор закрыт");
        }
    }

    public void printClimbers() {
        System.out.println("Список альпинистов в группу на гору " + mountain.getNameMountain() + ":");
        for (Climber climber : climbers) {
            if (climber == null) {
                return;
            }
            System.out.println(climber.getNameClimber());
        }
    }
}

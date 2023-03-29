package ru.itmo.homeworks.homework6;

import ru.itmo.homeworks.homework6.hikes.Climber;
import ru.itmo.homeworks.homework6.hikes.Group;
import ru.itmo.homeworks.homework6.hikes.Mountain;

public class Application {
    public static void main(String[] args) {
        Climber climber01 = new Climber("Petrov", "Saint-Petersburg");
        Climber climber02 = new Climber("Ivanov", "Ulan-Ude");
        Climber climber03 = new Climber("Sidorov", "Novosibirsk");
        Climber climber04 = new Climber("Sidorov", "Novosibirsk");
        Climber climber05 = new Climber("Noskov", "Barnaul");
        Climber climber06 = new Climber("Vladimirov", "Krasnoyarsk");
        Climber climber07 = new Climber("Yakovlev", "Novokuznetsk");
        Climber climber08 = new Climber("Belykh", "Irkutsk");

        Mountain mountain01 = new Mountain("Elbrus", "Russia", 5642);
        Mountain mountain02 = new Mountain("Everest", "Nepal, China", 8848);
        Mountain mountain03 = new Mountain("Aconcagua", "Argentina", 6960);

        Group group01 = new Group(mountain01, false);
        group01.addClimber(climber01);
        group01.addClimber(climber02);
        group01.addClimber(climber03);
        Group group02 = new Group(mountain02, true);
        group02.addClimber(climber04);
        group02.addClimber(climber05);
        Group group03 = new Group(mountain03, true);
        group03.addClimber(climber06);
        group03.addClimber(climber07);

        group01.getClimbers();
    }
}

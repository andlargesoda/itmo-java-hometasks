package ru.itmo.homeworks.homework07;

public class Application {
    public static void main(String[] args) {

        // объявление объектов поезд
        Train train01 = new Train(1,5);
        Train train02 = new Train(2,5);
        Train train03 = new Train(3,5);
        Train train04 = new Train(4,5);
        // получение цвета объявленных автомобилей до ремонта
        System.out.println("Цвет объявленных поездов до ремонта");
        System.out.println("Все поезда должны быть одинакового цвета, перекрасить их нельзя. По умолчанию все поезда серого цвета");
        System.out.println("Цвет поезда № " + train01.getNumber() + ": " + train01.getColor());
        System.out.println("Цвет поезда № " + train02.getNumber() + ": " + train02.getColor());
        System.out.println("Цвет поезда № " + train03.getNumber() + ": " + train03.getColor());
        System.out.println("Цвет поезда № " + train04.getNumber() + ": " + train04.getColor());

        System.out.println();

        // объявление объектов автобус
        Bus bus01 = new Bus(1, "белый");
        Bus bus02 = new Bus(2, "фиолетовый");
        Bus bus03 = new Bus(3, "желтый");
        // получение цвета объявленных автобусов до ремонта
        System.out.println("Цвет объявленных автобусов до ремонта");
        System.out.println("Изменить цвет автобуса нельзя");
        System.out.println("Цвета автобусов могут быть разными");
        System.out.println("Цвет автобуса № " + bus01.getNumber() + ": " + bus01.getColor());
        System.out.println("Цвет автобуса № " + bus02.getNumber() + ": " + bus02.getColor());
        System.out.println("Цвет автобуса № " + bus03.getNumber() + ": " + bus03.getColor());
        // наличие Wi-Fi в объявленном автобусе до ремонта
        System.out.println("Наличие Wi-Fi в объявленном автобусе до ремонта");
        System.out.println("Наличие Wi-Fi в автобусе № " + bus01.getNumber() + ": " + bus01.isWifiAccess());
        System.out.println("Наличие Wi-Fi в автобусе № " + bus02.getNumber() + ": " + bus02.isWifiAccess());
        System.out.println("Наличие Wi-Fi в автобусе № " + bus03.getNumber() + ": " + bus03.isWifiAccess());

        System.out.println();

        // объявление объектов автомобиль
        Car car01 = new Car(1);
        Car car02 = new Car(2);
        Car car03 = new Car(3);
        // присвоение цвета объявленным автомобилям
        car01.paintable("коричневый");
        car02.paintable("серый");
        car03.paintable("фиолетовый");
        // получение цвета объявленных автомобилей до ремонта
        System.out.println("Цвет объявленных автомобилей до ремонта");
        System.out.println("После ремонта все автомобили перекрашиваются");
        System.out.println("Цвета автомобилей могут быть разными");
        System.out.println("Цвет автомобиля № " + car01.getNumber() + ": " + car01.getColor());
        System.out.println("Цвет автомобиля № " + car02.getNumber() + ": " + car02.getColor());
        System.out.println("Цвет автомобиля № " + car03.getNumber() + ": " + car03.getColor());

        System.out.println();

        // присвоение уровня износа
        train01.setDamageLevel(2);
        train02.setDamageLevel(4);
        train03.setDamageLevel(6);
        train04.setDamageLevel(8);
        bus01.setDamageLevel(3);
        bus02.setDamageLevel(6);
        bus03.setDamageLevel(9);
        car01.setDamageLevel(1);
        car02.setDamageLevel(5);
        car03.setDamageLevel(10);

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

        System.out.println();

        // ремонтируем все транспортные средства составляющие массив
        service.fixTransport();

        // провека уровня износа транспортных средств после ремонта
        service.printTransports();

        // проверка цвета поезда после ремонта
        System.out.println();
        System.out.println("Цвет поездов из массива после ремонта");
        System.out.println("После ремонта все поезда не перекрашиваются");
        System.out.println("все поезда должны быть одинакового цвета");
        System.out.println("Цвет поезда № " + train01.getNumber() + ": " + train01.getColor());
        System.out.println("Цвет поезда № " + train02.getNumber() + ": " + train02.getColor());
        System.out.println("Цвет поезда № " + train03.getNumber() + ": " + train03.getColor());
        System.out.println("Цвет поезда № " + train04.getNumber() + ": " + train04.getColor());
        System.out.println();
        // проверка цвета автобусов после ремонта
        System.out.println("Цвет автобусов из массива после ремонта");
        System.out.println("Изменить цвет автобуса нельзя");
        System.out.println("Цвета автобусов могут быть разными");
        System.out.println("Цвет автобуса № " + bus01.getNumber() + ": " + bus01.getColor());
        System.out.println("Цвет автобуса № " + bus02.getNumber() + ": " + bus02.getColor());
        System.out.println("Цвет автобуса № " + bus03.getNumber() + ": " + bus03.getColor());
        // наличие Wi-Fi в объявленном автобусе после ремонта
        System.out.println("Наличие Wi-Fi в объявленном автобусе после ремонта");
        System.out.println("Наличие Wi-Fi в автобусе № " + bus01.getNumber() + ": " + bus01.isWifiAccess());
        System.out.println("Наличие Wi-Fi в автобусе № " + bus02.getNumber() + ": " + bus02.isWifiAccess());
        System.out.println("Наличие Wi-Fi в автобусе № " + bus03.getNumber() + ": " + bus03.isWifiAccess());
        System.out.println();
        System.out.println("Цвет автомобилей из массива после ремонта");
        System.out.println("После ремонта все автомобили перекрашиваются");
        System.out.println("Цвет автомобиля № " + car01.getNumber() + ": " + car01.getColor());
        System.out.println("Цвет автомобиля № " + car02.getNumber() + ": " + car02.getColor());
        System.out.println("Цвет автомобиля № " + car03.getNumber() + ": " + car03.getColor());
    }
}

package ru.itmo.homeworks.homework07;

public class Train extends Transport {

    private String color; // все поезда должны быть одинакового цвета, перекрасить нельзя
    private int numberOfWagons; // Поезд должен хранить информацию о количестве вагонов

    public Train(int number, int numberOfWagons) { // номер (обязательное свойство), поезд не может быть создан без вагонов
        super(number);
        if (numberOfWagons <= 0) {
            throw new IllegalArgumentException("Exception: numberOfWagons <= 0");
        }
        this.numberOfWagons = numberOfWagons;
        color = "серый";
    }

    @Override
    public void setDamageLevel(int damageLevel) { // 1.	уровень износа (изначально 0), поэтому необходим сеттер уровня износа
        super.setDamageLevel(damageLevel);
    }

    @Override
    public void fixDamageLevel() { // автомобиль можно отремонтирвоать
        if (damageLevel > 0) { // (значение не может стать меньше 0)
            damageLevel = 0; // у автомобиля снижается уровень износа
        }
    }

    public int addWagon() { // может быть добавлен вагон
        numberOfWagons = numberOfWagons + 1;
        return numberOfWagons;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public String getColor() {
        return color;
    }
}

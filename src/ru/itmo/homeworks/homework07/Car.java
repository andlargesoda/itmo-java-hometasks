package ru.itmo.homeworks.homework07;

public class Car extends Transport implements Paint {

    private String color; // цвета автомобилей могут быть разными

    public Car(int number) { // номер (обязательное свойство)
        super(number);
    }

    @Override
    public void setDamageLevel(int damageLevel) { // 1.	уровень износа (изначально 0), поэтому необходим сеттер уровня износа
        super.setDamageLevel(damageLevel);
    }

    public int getDamageLevel() {
        return damageLevel;
    }

    @Override
    public void fixDamageLevel() { // автомобиль можно отремонтирвоать
        if (damageLevel > 0) { // (значение не может стать меньше 0)
            damageLevel = 0; // у автомобиля снижается уровень износа
        }
    }

    @Override
    public void changeColor(String color) { // изменить цвет можно только у автомобиля
        System.out.println("Цвет машины:");
        if (color == null || color.length() < 3) { // проверка входящих данных
            throw new IllegalArgumentException("Exception: color.length() < 3");
        }
        this.color = color;
    }
}

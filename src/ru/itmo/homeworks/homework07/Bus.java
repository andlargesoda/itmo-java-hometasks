package ru.itmo.homeworks.homework07;

public class Bus extends Transport{
    private final String color; // изменить цвет поезда нельзя
    private boolean wifiAccess; // У автобуса должен быть флаг - наличие wifi

    public Bus(int number, String color) { // номер (обязательное свойство), цвета автобусов могут быть разными
        super(number);
        this.color = color;
    }

    public void setWifiAccess(boolean wifiAccess) { // "добавляется wifi, если его нет", то есть wifi можно добавить и раньше, чем будет проведен ремонт, но это свойство не обязательно, поэтому делаем сеттер
        this.wifiAccess = wifiAccess;
    }

    @Override
    public void setDamageLevel(int damageLevel) { // 1.	уровень износа (изначально 0), поэтому необходим сеттер уровня износа
        super.setDamageLevel(damageLevel);
    }
    @Override
    public int getDamageLevel() {
        return damageLevel;
    }

    @Override
    public void fixDamageLevel() {
        if (damageLevel < 0) {
            throw new IllegalArgumentException("Exception: damageLevel < 0");
        }
        damageLevel = 0;
        if (wifiAccess) {
            return;
        } else {
            wifiAccess = true;
        }
    }

    public boolean isWifiAccess() {
        return wifiAccess;
    }
}

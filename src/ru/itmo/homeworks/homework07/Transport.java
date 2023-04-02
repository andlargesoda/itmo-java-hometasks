package ru.itmo.homeworks.homework07;

abstract public class Transport {
    protected int damageLevel; // 1. уровень износа (изначально 0)
    protected final int number;

    public Transport(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Exception: number <= 0");
        }
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setDamageLevel(int damageLevel) {
        if (damageLevel <= 0) {
            throw new IllegalArgumentException("Exception: damageLevel <= 0");
        }
        this.damageLevel = damageLevel;
    }

    public int getDamageLevel() {
        return damageLevel;
    }

    abstract public void fixDamageLevel();
}

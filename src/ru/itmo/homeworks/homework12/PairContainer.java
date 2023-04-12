package ru.itmo.homeworks.homework12;

// Объявить класс PairContainer c generic свойствами
public class PairContainer<T, K> { // два типа, т.к. свойства могут быть разных типов

    // generic свойства без ограничений, т.е. класс не дочерний и не имплементируется
    private T key;
    private K value;

    public void setKey(T key) {
        this.key = key;
    }

    public void setValue(K value) {
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public K getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}

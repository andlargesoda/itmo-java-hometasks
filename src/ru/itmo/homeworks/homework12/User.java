package ru.itmo.homeworks.homework12;

public class User<S> {
    private S id;

    public void setId(S id) {
        this.id = id;
    }

    public S getId() {
        return id;
    }

    @Override
    public String toString() {
        return "" + id;
    }
}

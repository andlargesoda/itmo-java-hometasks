package ru.itmo.homeworks.homework12;

public class App {
    public static void main(String[] args) {

        // Создать экземпляр PairContainer, где key - любые числа, value - строка
        PairContainer<Number, String> pairContainer01 = new PairContainer<>();
        pairContainer01.setKey(5);
        pairContainer01.setValue("5");
        System.out.println(pairContainer01.getKey());
        System.out.println(pairContainer01.getValue());

        // Создать экземпляр PairContainer, где key - строка, value - тип User, у которого id - любые числа
        PairContainer<String, User<Number>> pairContainer02= new PairContainer<>();
        User<Number> numberUser = new User<>();
        numberUser.setId(2);
        pairContainer02.setKey("2");
        pairContainer02.setValue(numberUser);
        System.out.println(pairContainer02.getKey());
        System.out.println(pairContainer02.getValue());

        // Создать экземпляр PairContainer, где key - строка, value - тип PairContainer,
        // у которого key - любые числа, value - тип User, у которого id - строка
        PairContainer<String, PairContainer<Number, User<String>>> pairContainer03 = new PairContainer<>();
        User<String> stringUser = new User<>();
        stringUser.setId("65");
        PairContainer<Number, User<String>> pairContainer04 = new PairContainer<>();
        pairContainer04.setKey(5);
        pairContainer04.setValue(stringUser);
        pairContainer03.setKey("6");
        pairContainer03.setValue(pairContainer04);
        System.out.println(pairContainer03.getKey());
        System.out.println(pairContainer03.getValue());
    }
}

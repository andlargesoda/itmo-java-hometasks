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
        PairContainer<String, User<Number>> pairContainer02 = new PairContainer<>();
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

        /* Задача 2
        interface Eatable extends Serializable{}
        interface Runnable {}

        class Animal implements Runnable{}

        class Cat extends Animal implements Eatable{}
        class Kitten extends Cat{}

        class Dog extends Animal implements Serializable{}


        class Task {

            // в классе можно вызывать generic тип и его родителей
            public static  <T extends Cat & Eatable> void void01(T object){
                // ВОПРОС: методы каких типов можно вызвать у object ???
                // Object
                // Animal
                // Cat
                // Runnable
                // Serializable
                // Eatable
            }

            public static  <T extends Animal & Serializable> void void02(T object){
                // ВОПРОС: методы каких типов можно вызвать у object ???
                // Object
                // Animal
                // Runnable
                // Serializable
            }

            public static  <T extends Serializable & Runnable> void void03(T object){
                // ВОПРОС: методы каких типов можно вызвать у object ???
                // Object
                // Runnable
                // Serializable
            }
         */
        /*
            public static void main(String[] args) {

            // в точке входа в программу можно вызывать generic тип и его детей
         */
        //        Task.<Cat, Kitten>void01(cat, kitten);
        //
        //      Task.<Cat, Kitten,Dog>void02(cat, kitten, dog);
        //  Task.<Dog>void03(dog);

    }
}

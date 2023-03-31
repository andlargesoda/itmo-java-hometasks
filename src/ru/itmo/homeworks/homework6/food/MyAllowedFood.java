package ru.itmo.homeworks.homework6.food;

import java.util.Arrays;

public class MyAllowedFood {

// объявляем свойства

    // список (массив) продуктов
    private Food[] foods;

    // индекс продукта в массиве
    private int indexFood;

    // максимальное кол-во белков
    private int maxProtein;

    // максимальное кол-во жиров
    private int maxFat;

    // максимальное кол-во углеводов
    private int maxCarbohydrate;

    // максимальное кол-во калорий
    private int maxCalorie;

    // конструктор
    public MyAllowedFood(int maxProtein, int maxFat, int maxCarbohydrate, int maxCalorie) {
        if (maxProtein <= 0) {
            throw new IllegalArgumentException("Exception: maxProtein <= 0");
        }
        if (maxFat <= 0) {
            throw new IllegalArgumentException("Exception: maxFat  <= 0");
        }
        if (maxCarbohydrate <= 0) {
            throw new IllegalArgumentException("Exception: maxCarbohydrate  <= 0");
        }
        if (maxCalorie <= 0) {
            throw new IllegalArgumentException("Exception: maxCalorie  <= 0");
        }
        this.maxProtein = maxProtein;
        this.maxFat = maxFat;
        this.maxCarbohydrate = maxCarbohydrate;
        this.maxCalorie = maxCalorie;
        foods = new Food[4];
    }

    // метод проверки данных для максимального кол-ва белков
    public void addAllowedProduct(Food food) {
        if (food == null) {
            System.out.println("Не указан продукт");
            return;
        }
        if (maxProtein > food.getProtein()) {
            System.out.println(food.getNameFood() + " имеет низкое содержание белков");
            return;
        }
        if (maxFat < food.getFat()) {
            System.out.println(food.getNameFood() + " имеет высокое содержание жиров");
            return;
        }
        if (maxCarbohydrate < food.getCarbohydrate()) {
            System.out.println(food.getNameFood() + " имеет высокое содержание углеводов");
            return;
        }
        if (maxCalorie < food.getCalorie()) {
            System.out.println(food.getNameFood() + " имеет высокое содержание калорий");
            return;
        }
        if (foods.length == indexFood) {
            System.out.println("Список продуктов заполнен");
            return;
        }
        foods[indexFood] = food;
        indexFood++;
        System.out.println(food.getNameFood() + " добавлен в список продуктов");
    }

    // метод вывода списка продуктов
    public void printFood() {
        System.out.println("Список продуктов:");
        for (Food food : foods) {
            if (food == null) {
                return;
            }
            System.out.println(food.getNameFood());
        }
    }
}

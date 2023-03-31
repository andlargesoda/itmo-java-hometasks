package ru.itmo.homeworks.homework6.food;

import ru.itmo.homeworks.homework6.food.Food;
import ru.itmo.homeworks.homework6.food.MyAllowedFood;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Food food01 = new Food("Карбонара", 11, 9, 19, 275);
        Food food02 = new Food("Борщ", 11, 3, 4, 57);
        Food food03 = new Food("Пицца", 8, 25, 97, 332);
        Food food04 = new Food("Сырники", 20, 6, 16, 195);
        Food food05 = new Food("Солянка", 20, 6, 16, 195);
        Food food06 = new Food("Уха", 20, 6, 16, 195);
        MyAllowedFood myAllowedFood = new MyAllowedFood(10, 10, 20, 300);
        myAllowedFood.addAllowedProduct(food01);
        myAllowedFood.addAllowedProduct(food02);
        myAllowedFood.addAllowedProduct(food03);
        myAllowedFood.addAllowedProduct(food04);
        myAllowedFood.addAllowedProduct(food05);
        myAllowedFood.addAllowedProduct(food06);
        myAllowedFood.printFood();
    }
}

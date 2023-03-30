package ru.itmo.homeworks.homework6.food;

import ru.itmo.homeworks.homework6.food.Food;
import ru.itmo.homeworks.homework6.food.MyAllowedFood;

import java.util.Arrays;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {

        Food food01 = new Food();
        food01.NameFood("Карбонара");
        food01.Protein(11);
        food01.Fat(9);
        food01.Carbohydrate(27);
        food01.Calorie(275);

        Food food02 = new Food();
        food02.NameFood("Борщ");
        food02.Protein(9);
        food02.Fat(3);
        food02.Carbohydrate(4);
        food02.Calorie(57);

        Food food03 = new Food();
        food03.NameFood("Пицца");
        food03.Protein(8);
        food03.Fat(25);
        food03.Carbohydrate(97);
        food03.Calorie(332);

        Food food04 = new Food();
        food04.NameFood("Сырники");
        food04.Protein(20);
        food04.Fat(6);
        food04.Carbohydrate(16);
        food04.Calorie(195);

        MyAllowedFood myAllowedFood = new MyAllowedFood(10,10,20,300);
        myAllowedFood.addAllowedFood(food01);
        myAllowedFood.addAllowedFood(food02);
        myAllowedFood.addAllowedFood(food03);
        myAllowedFood.addAllowedFood(food04);

        myAllowedFood.printFood();
    }
}

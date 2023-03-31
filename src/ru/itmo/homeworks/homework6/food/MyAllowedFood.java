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

    // объявляем методы

    // метод проверки данных для максимального кол-ва белков
    /*public void setMaxProteinProtein(int maxProtein) {
        if (maxProtein  <= 0) {
            throw new IllegalArgumentException("Exception: maxProtein <= 0");
        }
        this.maxProtein = maxProtein;
    }

    // метод проверки данных для максимального кол-ва жиров
    public void setMaxFat(int maxFat) {
        if (maxFat  <= 0) {
            throw new IllegalArgumentException("Exception: maxFat  <= 0");
        }
        this.maxFat = maxFat;
    }

    // метод проверки данных для максимального кол-ва углеводов
    public void setMaxCarbohydrate(int MaxCarbohydrate) {
        if (MaxCarbohydrate  <= 0) {
            throw new IllegalArgumentException("Exception: maxCarbohydrate  <= 0");
        }
        this.maxCarbohydrate = MaxCarbohydrate;
    }
    // метод проверки данных для максимального кол-ва калорий
    public void setMaxCalorie(int maxCalorie) {
        if (maxCalorie  <= 0) {
            throw new IllegalArgumentException("Exception: maxCalorie  <= 0");
        }
        this.maxCalorie = maxCalorie;
    }
*/
    // метод добавления разрешенного продукта
    public void addAllowedFood(Food food) {
        if (food == null) {
            System.out.println("Нет продукта");
            return;
        }
        if (maxProtein > food.protein) {
            System.out.println("Продукт " + " имеет низкое содержание белков");
            return;
        }
        if (maxFat < food.fat) {
            System.out.println("Продукт " + " имеет высокое содержание жиров");
            return;
        }
        if (maxCarbohydrate < food.carbohydrate) {
            System.out.println("Продукт " + " имеет высокое содержание углеводов");
            return;
        }
        if (maxCalorie < food.calorie) {
            System.out.println("Продукт " + " имеет Высокое содержание калорий");
            return;
        }
        if (indexFood < 5) {
            foods[indexFood] = food;
            indexFood++;
        } else {
            System.out.println("Список продуктов заполнен");
        }
    }
    public Food[] getFoods() {
        System.out.println(Arrays.toString(foods));
        return foods;
    }
}

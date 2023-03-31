package ru.itmo.homeworks.homework6.food;

// объявили класс
public class Food {

    // Свойства
    private String nameFood; // название продукта
    private int protein; // кол-во белков
    private double fat; // кол-во жиров
    private int carbohydrate; // кол-во углеводов
    private int calorie; // кол-во калорий

    // Конструкторы

    public Food(int protein) {
        setProtein(protein);
    }

    public Food(double fat) {
        setFat(fat);
    }

    public Food(String nameFood, int carbohydrate) {
        setNameFood(nameFood);
        setCarbohydrate(carbohydrate);
    }

    public Food(String nameFood, int protein, int fat, int carbohydrate, int calorie) {
        setNameFood(nameFood);
        setProtein(protein);
        setFat(fat);
        setCarbohydrate(carbohydrate);
        setCalorie(calorie);
    }

    // Методы сеттеры
    public void setNameFood(String nameFood) { // метод проверки входных данных для названия продукта
        if (nameFood == null || nameFood.length() < 3) {
            throw new IllegalArgumentException("Exception: nameFood.length() < 3");
        }
        this.nameFood = nameFood;
    }

    public void setProtein(int protein) {
        if (protein <= 0) {
            throw new IllegalArgumentException("Exception: protein <= 0");
        }
        this.protein = protein;
    }

    public void setFat(double fat) {
        if (fat <= 0) {
            throw new IllegalArgumentException("Exception: fat <= 0");
        }
        this.fat = fat;
    }

    public void setCarbohydrate(int carbohydrate) {
        if (carbohydrate <= 0) {
            throw new IllegalArgumentException("Exception: carbohydrate <= 0");
        }
        this.carbohydrate = carbohydrate;
    }

    public void setCalorie(int calorie) {
        if (calorie <= 0) {
            throw new IllegalArgumentException("Exception: calorie <= 0");
        }
        this.calorie = calorie;
    }

    // Методы геттеры
    public String getNameFood() {
        return nameFood;
    }

    public int getProtein() {
        return protein;
    }

    public double getFat() {
        return fat;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

    public int getCalorie() {
        return calorie;
    }
}

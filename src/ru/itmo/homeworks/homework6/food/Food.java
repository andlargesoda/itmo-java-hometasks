package ru.itmo.homeworks.homework6.food;

// объявили класс
public class Food {

    // объявляем свойства

    // название продукта
    private String nameFood;

    // кол-во белков
    public int protein;

    // кол-во жиров
    public double fat;

    // кол-во углеводов
    public int carbohydrate;

    // кол-во калорий
    public int calorie;

    // объявляем конструкторы
    public void NameFood(String nameFood) {
        setNameFood(nameFood);
    }
    public void Protein(int protein) {
        setProtein(protein);
    }
    public void Fat(double fat) {
        setFat(fat);
    }
    public void Carbohydrate(int carbohydrate) {
        setCarbohydrate(carbohydrate);
    }
    public void Calorie(int calorie) {
        setCalorie(calorie);
    }

    // объявляем методы

    // метод проверки данных для названия продукта
    public void setNameFood(String nameFood) {
        if (nameFood == null || nameFood.length() < 3) {
            throw new IllegalArgumentException("Exception: nameFood.length() < 3");
        }
        this.nameFood = nameFood;
    }

    // метод проверки данных для кол-ва белков
    public void setProtein(int protein) {
        if (protein  <= 0) {
            throw new IllegalArgumentException("Exception: protein <= 0");
        }
        this.protein = protein;
    }

    // метод проверки данных для кол-ва жиров
    public void setFat(double fat) {
        if (fat  <= 0) {
            throw new IllegalArgumentException("Exception: fat  <= 0");
        }
        this.fat = fat;
    }

    // метод проверки данных для кол-ва углеводов
    public void setCarbohydrate(int carbohydrate) {
        if (carbohydrate  <= 0) {
            throw new IllegalArgumentException("Exception: carbohydrate  <= 0");
        }
        this.carbohydrate = carbohydrate;
    }
    // метод проверки данных для кол-ва калорий
    public void setCalorie(int calorie) {
        if (calorie  <= 0) {
            throw new IllegalArgumentException("Exception: calorie  <= 0");
        }
        this.calorie = calorie;
    }
}

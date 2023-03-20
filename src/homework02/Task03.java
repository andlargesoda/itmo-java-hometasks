package homework02;

public class Task03 {
    public static void main(String[] args) {
        int monthNumber = 6; // объявили целочисленную переменную monthNumber и присвоили ей значение
        String winter = "Зима", spring = "Весна", summer = "Лето", autumn = "Осень", error = "Вы ввели неверное число, введите число от 1 до 12";
        /*
         объявили строковые переменные для каждого времени года, ошибки и присвоили им значение
        */
        if (monthNumber >= 1 && monthNumber <= 2 || monthNumber == 12) { // если значение переменной monthNumber >= 1 и monthNumber <= 2 или monthNumber == 12, то в консоль выводится Зима
            System.out.println(winter);
        } else if (monthNumber >= 3 && monthNumber <= 5) { // если значение переменной monthNumber >= 3 и monthNumber <= 5, то в консоль выводится Весна
            System.out.println(spring);
        } else if (monthNumber >= 6 && monthNumber <= 8) { // если значение переменной monthNumber >= 6 и monthNumber <= 8, то в консоль выводится Лето
            System.out.println(summer);
        } else if (monthNumber >= 9 && monthNumber <= 11) { // если значение переменной monthNumber >= 9 и monthNumber <= 11, то в консоль выводится Осень
            System.out.println(autumn);
        } else {
            System.out.println(error); // если значение переменной monthNumber > 12 и monthNumber <= 0, то в консоль выводится Вы ввели неверное число, введите число от 1 до 12
        }
    }
}

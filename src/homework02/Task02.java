package homework02;

public class Task02 {
    public static void main(String[] args) {
        int number01 = 18; // объявили целочисленную переменную number01 и присвоили ей значение
        number01 %= 2; // переопределили значение переменной number01 так, что переменной number01 присваивается остаток от деления number01 на 2
        int result01 = number01 == 0 ? 0 : -1; // если остаток от деления number01 на 2 равен 0, то в консоль выводится значение 0, иначе -1
        System.out.println(result01);
    }
}

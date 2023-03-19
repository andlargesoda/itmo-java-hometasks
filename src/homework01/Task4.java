package homework01;

public class Tasks4 {
    public static void main(String[] args) {
        int number = 11;
        int unit = number % 10;
        int ten = number / 10;
        int sum = unit + ten;
        System.out.println("Сумма цифр " + ten + " и " + unit + " , представляющих разряды десятков и единиц числа " + number + " , соответственно, составляет " + sum);
    }
}

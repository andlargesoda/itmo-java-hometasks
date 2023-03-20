package homework02;

public class Task04 {
    public static void main(String[] args) {
        int count = -1; // объявили целочисленную переменную count и присвоили ей значение
        String gradeA = "Отлично", gradeB = "Хорошо", gradeC = "удовлетворительно", gradeD = "попробуйте в следующий раз", error = "Вы указали неверное кол-во баллов, введите число от 0 до 100";
        /*
         объявили строковые переменные для каждого дипазона баллов, ошибки и присвоили им значение
        */
        if (count >= 0 && count <= 39) { // если значение переменной count >= 0 и count <= 39, то в консоль выводится попробуйте в следующий раз
            System.out.println(gradeD);
        } else if (count >= 40 && count <= 59) { // если значение переменной count >= 40 и count <= 59, то в консоль выводится удовлетворительно
            System.out.println(gradeC);
        } else if (count >= 60 && count <= 79) { // если значение переменной count >= 60 и count <= 79, то в консоль выводится Хорошо
            System.out.println(gradeB);
        } else if (count >= 80 && count <= 100) { // если значение переменной count >= 80 и count <= 100, то в консоль выводится Отлично
            System.out.println(gradeA);
        } else {
            System.out.println(error); // если значение переменной count > 100 и count < 0, то в консоль выводится Вы указали неверное кол-во баллов, введите число от 0 до 100
        }
    }
}

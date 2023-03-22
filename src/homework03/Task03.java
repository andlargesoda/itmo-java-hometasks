package homework03;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        int max = 9; // объявили целочисленную переменную min (нижний лимит диапазона для метода Math.random()) и присвоили ей значение
        int min = 1; // объявили целочисленную переменную max (верхний лимит диапазона для метода Math.random()) и присвоили ей значение
        int diff = max - min; // объявили целочисленную переменную difference (разница между нижним и верхним лимитами диапазона для метода Math.random()
        // Диапазон [0;1) умножаем на 9
        // получаем диапазон [0;9), 9 исключительно, следовательно максимальное достижимое число в данном диапазоне 8.999999...имеем дело с вещественным диапазоном
        // применяем (int) перед  Math.random()*9. Вещественная часть отсекается и мы получаем диапазон [0;8]
        // к диапазону [0;8] прибавляем 1 и получаем диапазон [1;9]
        int numberMachine = (int) (Math.random() * (diff + 1)) + 1; // объявили целочисленную переменную и присвоили ей значение, определяемое компьютером случайно
        System.out.println("Компьютер загадал целое число в диапазоне от 1 до 9 включительно");
        Scanner in = new Scanner(System.in); // объявили считывающеую переменную in и присвоили значение, которое позволит считывать значение из потока ввода System.in
        int numberUser = 0; // объявили и присвоили целочисленной переменной numberUser значение 0, данная переменная задействована в условии цикла While, поэтому ей и присвоено значение 0, иначе она сможет быть инициализирована
        while (numberMachine != numberUser) { // пока число numberUser, введенное пользователем с терминала не станет равным случайно ввыбранному компьютером числу, тело цикла While повторяется
            System.out.println("Введите число из диапазона от 1 до 9, которое мог загадать компьютер:");
            numberUser = in.nextInt(); // объявили целочисленную переменную number, в которую считывается ввод пользователя
            if (numberUser == 0) { // если пользователь введет 0, то произойдет выход из цикла Break; проверяется всегда, т.к. пользватель может ввести число вне диапаза [1;9] и на 0 была сформулировано отдельное требование в условии задачи
                break;
            }
            if (numberUser < 0 || numberUser > 9) { // если пользователь введет число вне диапазона < 0 или > 9, то появится сообщение о неверном вводе числа и выполнение текущей итерации прекратится continue; проверяется всегда, т.к. пользватель может ввести число вне диапаза [1;9], на 0 отдельное требование
                System.out.println("Вы ввели неверное число!");
                continue;
            }
            // если проверки на 0 и нахождения числа вне диапаза [1;9] пройдены, то числа numberMachine и numberUser находятся в [1;9] и можно перейти к угадыванию числа
            if (numberMachine > numberUser) { // если введенное число < случайного, то терминал сообщит об этом и цикл начнется заново
                System.out.println("загаданное число больше");
            } else if (numberMachine < numberUser) { // если введенное число > случайного, то терминал сообщит об этом и цикл начнется заново
                System.out.println("загаданное число меньше");
            } else { // если введенное число = случайному, то терминал сообщит об этом и цикл закончится
                System.out.println("Вы угадали");
            }
        }
    }
}

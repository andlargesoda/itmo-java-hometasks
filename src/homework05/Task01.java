package homework05;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
           /*1. Считывать с консоли строки до тех пор, пока пользователь не введёт "exit".
    Каждую полученную строку приводить к виду: первая заглавная,
    остальные маленькие и выводить в консоль. Пробелов в начале и конце строки быть не должно.
    */
        String stringExit = "Exit";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст:");
        String stringUser = in.nextLine();
        stringUser = stringUser.strip();
        System.out.println(stringUser.toUpperCase());
        while (stringUser.compareToIgnoreCase(stringExit) != 0) {
            System.out.println("Введите текст");
            stringUser = in.nextLine();
            stringUser = stringUser.toLowerCase();
            System.out.println(stringUser.strip());
        }
    }
}

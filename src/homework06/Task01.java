package homework06;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
    /*Заполните массив на N элементов (размер массива вводит пользователь) случайным целыми числами и
    выведете максимальное, минимальное и среднее арифметическое значение элементов массива
     */
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.println("Введите размер массива:");
        int size = in.nextInt();
        int[] arrays01 = new int[size];
        for (int i = 0; i < arrays01.length; i++) {
            arrays01[i] = (int) (Math.random() * arrays01.length);
            sum = sum + arrays01[i];
        }
        System.out.println("Сгенирированный массив, отсортированный в порядке возрастание:");
        Arrays.sort(arrays01);
        System.out.println(arrays01);
        System.out.println(Arrays.toString(arrays01));
        System.out.println("Максимальный элемент массива:");
        System.out.println(arrays01[0]);
        System.out.println("Минимальный элемент массива:");
        System.out.println(arrays01[arrays01.length - 1]);
        double mean = sum / (double) arrays01.length;
        System.out.println("Среднее арифметическое массива:");
        System.out.println(mean);
    }
}

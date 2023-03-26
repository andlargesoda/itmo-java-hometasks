package homework06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task0201 {
    public static void main(String[] args) {
        /* Создайте массив из чётных чисел [2;20] (использовать Math.random()) и
        выведите элементы массива в консоль в обратном порядке (20 18 16 ... 4 2)
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = in.nextInt();
        int[] arrays01 = new int[size];
        int i = 0;
        while (i < arrays01.length) {
            int randomNumber = (int) (Math.random() * 19 + 2);
            arrays01[i] = randomNumber;
            int evenNumberCheck = arrays01[i] % 2;
            if (evenNumberCheck == 0) {
                i++;
            }
        }
//        Arrays.sort(arrays01);
//        System.out.println(Arrays.toString(arrays01));
        Arrays.sort(arrays01);
        System.out.println(Arrays.toString(arrays01));
        for (i = 0; i < arrays01.length; i++) {
            arrays01[arrays01.length-i-1] = arrays01[i];
        }
        System.out.println(Arrays.toString(arrays01));
    }
}

package homework06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /* Создайте массив из чётных чисел [2;20] (использовать Math.random()) и
        выведите элементы массива в консоль в обратном порядке (20 18 16 ... 4 2)
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = in.nextInt();
        Integer[] arrays01 = new Integer[size];
        int i = 0;
        while (i < arrays01.length) {
            int randomNumber = (int) (Math.random() * 19 + 2);
            arrays01[i] = randomNumber;
            int evenNumberCheck = arrays01[i] % 2;
            if (evenNumberCheck == 0) {
                i++;
            }
        }

        Arrays.sort(arrays01, Collections.reverseOrder());
        System.out.println(Arrays.toString(arrays01));
    }
}

package homework06;

import java.util.Arrays;
import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        /*
        Создать массив, наполнить его целыми числами (отрицательными и положительными).
        Отрицательные элементы массива скопировать в новый массив.
        Размер массива должен быть равен количеству отрицательных элементов.
        */
        Scanner scanner = new Scanner(System.in);
        int sizeArray = 0;
        loop01:
        while (sizeArray < 2) {
            System.out.println("Введите кол-во целочисленных элементов массива:");
            sizeArray = scanner.nextInt();
            if (sizeArray < 2) {
                System.out.println("Кол-во целочисленных элементов массива должно быть минимум 2, т.к. необходимы одно отрицательное и положительное числа");
            }
        }
        int[] array01 = new int[sizeArray];
        int highLimitRange = 0;
        int lowLimitRange = 0;
        loop02:
        while (highLimitRange <= 0) {
            System.out.println("Введите значение верхнего предела диапазона случайных чисел:");
            highLimitRange = scanner.nextInt();
            if (highLimitRange <= 0) {
                System.out.println("Значение верхнего предела должно быть > 0");
            }
        }
        loop03:
        while (lowLimitRange >= 0) {
            System.out.println("Введите значение нижнего предела диапазона случайных чисел:");
            lowLimitRange = scanner.nextInt();
            if (lowLimitRange >= 0) {
                System.out.println("Значение верхнего предела должно быть < 0");
            }
        }
        System.out.println("Заданный диапазон: [" + lowLimitRange + ";" + highLimitRange + "]");
        int differenceLimitRange = highLimitRange - lowLimitRange;
        int countNegativeNumber = 0;
        int i = 0;
        loop04:
        while (i < array01.length) {
            array01[i] = (int) (Math.random() * (differenceLimitRange + 1) + lowLimitRange);
            if (array01[i] < 0) {
                countNegativeNumber++;
            }
            if (array01[i] != 0) {
                i++;
            }
        }
        Arrays.sort(array01);
        System.out.println("Сгенерированный массив : " + Arrays.toString(array01));
        int[] array02 = new int[countNegativeNumber];
        System.arraycopy(array01, 0, array02, 0, countNegativeNumber);
        System.out.println(Arrays.toString(array02));
    }
}

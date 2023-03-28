package homework06;

import java.util.Arrays;
import java.util.Scanner;

public class Task0302 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число элементов в массиве:");
        int size = Integer.parseInt(scanner.nextLine());
        String[] array01 = new String[size];
        int j = 0;
        loop01:
        for (int i = 0; i < array01.length; i++) {
            System.out.println("Введите элемент");
            array01[i] = scanner.nextLine();
            while (j < array01.length) {
                if (array01[i] == array01[j+1]) {
                    continue;
                } else {
                    j++;
                }
            }
        }
        System.out.println(Arrays.toString(array01));
    }
}

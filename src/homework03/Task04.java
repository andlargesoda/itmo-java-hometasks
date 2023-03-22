package homework03;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberUser = 1;
        int lowLimitRange = 2;
        int highLimitRange = 100;
        while (numberUser < lowLimitRange || numberUser > highLimitRange) {
            System.out.println("Загадайте число в диапазоне [2;100]");
            numberUser = in.nextInt();
            if (numberUser < lowLimitRange || numberUser > highLimitRange) {
                System.out.println("Вы ввели неверное число");
                //continue;
            }
        }
        System.out.println(numberUser);
        int numberComputer = 1;
        while (numberComputer != numberUser) {
            int middleRange = (highLimitRange - lowLimitRange) / 2 + lowLimitRange;
            System.out.println("Загаданное вами число равно " + middleRange + "? " + "Ответьте 1 = да / 0 = нет");
            int answer = in.nextInt();
            switch (answer) {
                case 1:
                    numberComputer = middleRange;
                    break;
                case 0:
                    System.out.println("ПК не угадал");
                    System.out.println("Загаданное число больше " + middleRange + "? " + "Ответьте 1 = да / 0 = нет");
                    int answer01 = in.nextInt();
                    switch (answer01) {
                        case 1:
                            lowLimitRange = middleRange + 1;
                            break;
                        case 0:
                            highLimitRange = middleRange - 1;
                            break;
                    }
                    break;
            }
        }
        System.out.println(numberComputer);
        System.out.println("Ваше число " + numberUser + " разгадали");
    }
}

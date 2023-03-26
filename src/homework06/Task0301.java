package homework06;

import java.util.Arrays;
import java.util.Scanner;

public class Task0301 {
    public static void main(String[] args) {
        /*Задать массив на N слов. В цикле считывать с консоли слова (scanner.nextLine()), и добавлять их в массив (добавлять
        новое слово в массив можно только, если в нем его еще нет). В итоге в массиве будут только уникальные слова.
        Выход из программы по слову exit (слово 'exit' в массив не добавлять) или если массив заполнен. Перед завершением
        программы, вывести получившийся массив в консоль
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во слов в массиве:");
        int wordCount = Integer.parseInt(in.nextLine());
        int wordNumber = 0;
        String[] stringArrays01 = new String[wordCount];
        int i = 0;
            loop01:
            while (i < stringArrays01.length) {
                    wordNumber = wordNumber + 1;
                    System.out.println("Введите слово № " + wordNumber + ":");
                    stringArrays01[i] = in.nextLine();
                    int duplicateSearch = Arrays.binarySearch(stringArrays01, stringArrays01[i]);
                    if (duplicateSearch < 0) {
                        i++;
                    } else {
                        System.out.println("Введенное слово уже есть в массиве");
                    }
                    if (stringArrays01[i].equalsIgnoreCase("Exit")) {
                        stringArrays01[i] = null;
                        break loop01;
                    }
            }
        System.out.println(Arrays.toString(stringArrays01));
    }
}

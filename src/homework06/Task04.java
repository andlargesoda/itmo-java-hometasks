package homework06;

import java.util.Arrays;
import java.util.Comparator;

public class Task04 {
    public static void main(String[] args) {
        /*
        Найдите самое длинное слово в предложении, при условии, что в предложении все слова разной длины.
        Предложение для поска длинного слова: `"в предложении все слова разной длины"` (самостоятельно найти метод преобразования
        строки в массив строк).
         */
        // 1. Метод split в Java разделяет строку на подстроки,
        // используя разделитель, который определяется с помощью регулярного выражения regex
        // 2. String[] split(String regex)
        // 3. regex - разделяющее регулярное выражение
        // 4.1. Метод split в Java разделяет строку на подстроки.
        // Данные подстроки собираются методом в массив и представляют собой его возвращаемое значение
        // 4.2. Принимаемый параметр regex — это шаблон регулярного выражения, который применяется к исходной строке и
        // по совпадениям определяет в ней символ (или комбинацию символов) разделителя
        String string="в предложении все слова разной длины";
        String[] stringArray=string.split(" ");
        String longestWord = "";
        int lengthWord = 0;
        int min = 0;
        System.out.println(Arrays.toString(stringArray));
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("Длина слова " + stringArray[i] + " равна " + stringArray[i].length() + " символов");
            if (stringArray[i].length() > min) {
                longestWord = stringArray[i];
                lengthWord = stringArray[i].length();
                min = min + stringArray.length;
            }
        }
        System.out.println("Самое длинное слово в предложении: " + "'" + longestWord + "'" + " состоит из " + lengthWord + " букв");
    }
}

package homework05;

import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {
        // 3. Вывести в консоль количество слов "JAVA", встречающихся в тексте из предыдущего задания
        String stringText = " JAVA стоит первым в рейтинге популярности использования языков; JAVA один из наиболее мощных\n" +
                "        высокоуровневых языков программирования; JAVA поддерживает большое количество встроенных библиотех, которые позволяют\n" +
                "        быстро писать проекты любого класса сложности; курс «JUNIOR JAVA DEVELOPER» предназначен для подготовки\n" +
                "        программистов-профессионалов, специализирующихся на разработке программного обеспечения различного класса и уровня\n" +
                "        сложности .";
        stringText = stringText.stripLeading();
        System.out.println(stringText);
        String stringJava = "JAVA";
        int count = 0;
        String[] string01 = stringText.split(" ");
        System.out.println(Arrays.toString(string01));
        for (int i = 0; i < string01.length; i++) {
            if (string01[i].equalsIgnoreCase(stringJava)) {
                count++;
            }
        }
        System.out.println("Кол-во слов " + stringJava + " в тексте: " + count);
    }
}

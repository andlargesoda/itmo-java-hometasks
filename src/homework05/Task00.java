package homework05;

public class Task00 {
    public static void main(String[] args) {
        String string01 = "строка";
        String string02 = "Строка";

        System.out.println(string01.equals(string02));

        System.out.println(string01.equalsIgnoreCase(string02));

        // Метод replaceAll
        // 1. 1.	Заменяет каждую подстроку этой строки,
        // которая соответствует заданному регулярному выражению (regex),
        // заданной заменой (replacement)
        // 2. str.replaceAll(String regex, String repl)
        // 3. regex - регулярное выражение, которому должна соответствовать эта строка
        // repl - строка, которая будет заменена для каждого совпадения
        // 4. Возвращается String
        String string03 = "JavaRush, Diego the best, Diego is Java God";
        System.out.println(string03.replaceAll("Diego", "Amigo"));
        System.out.println(string03.replaceAll("Diego", string02));

        // Метод replaceFirst
        // 1. Заменяет первую подстроку этой строки,
        // которая соответствует заданному регулярному выражению, заданной заменой
        // 2. str.replaceFirst(String regex, String repl)
        // 3. regex - регулярное выражение, которому должна соответствовать эта строка
        // repl - cnрока, которая будет заменена для первого совпадения
        // 4. Возвращается String
        System.out.println(string03.replaceFirst("Diego", "Amigo"));
        System.out.println(string03.replaceFirst("Diego", string01));
        System.out.println(string03.replaceFirst("Diego", string02));

        // Метод contains
        // 1. Возвращает true тогда и только тогда,
        // когда эта строка содержит указанную последовательность значений char
        // 2. str.contains(s)
        // 3. s-последовательность символов
        // 4. boolean
        System.out.println(string03.contains("Diego"));
        System.out.println(string03.contains(string01));
        // System.out.println(string03.contains(null));

        // Метод startsWith
        // 1. имеет два варианта и проверяет начинается ли строка с указанного префикса,
        // начиная с указанного индекса или с начала (по умолчанию).
        // 2. startsWith(String prefix, int toffset)
        // 3. prefix- подстрока, начинающаяся с первого символа строки
        // toffset – индекс / номер позциции префикса, с которого необходимо начать поиск в этой строке4
        System.out.println(string03.startsWith(string01));
        System.out.println(string03.startsWith("Java")); // true
        System.out.println(string03.startsWith("R", 4)); //true

        // Метод endsWith
        // 1. проверяет, заканчивается ли эта строка указанным окончанием
        // 2. endsWith(String suffix)
        // 3. suffix – подстрока, заканчивающаяся на последний символ строки
        String stringEndWith = "God";
        System.out.println(string03.endsWith("god")); // false
        System.out.println(string03.endsWith("God")); // true
        System.out.println(string03.endsWith(stringEndWith)); // true

        // Метод trim()
        // 1. возвращает копию строки с пропущенными начальными и конечными пробелами,
        // другими словами метод позволяет в Java удалить пробелы в начале и конце строки
        // 2. String trim()
        // 4. возвращает копию данной строки, в которой удаляются начальные и конечные пробелы,
        // или данную строку, если она не имеет начальных или конечных пробелов.
        // trim(), который определяет пробел, как любой символ,
        // который меньше или равен пробелу из Unicode (U+0020).
        String stringTrim01 = " Добро пожаловать в ИТМО ";
        String stringTrim02 = '\u2001' + " Добро пожаловать в ИТМО " + '\u2001';
        System.out.println(stringTrim01.trim());
        System.out.println(stringTrim02.trim());

        // Метод strip()
        // Возвращает строку, значением которой является эта строка,
        // с удаленными начальными и конечными пробелами.
        //Если этот объект String представляет пустую строку или
        // если все кодовые точки в этой строке являются пробелами, то возвращается пустая строка.
        //В противном случае возвращает подстроку этой строки, начиная с первой кодовой точки,
        // которая не является пробелом, до последней кодовой точки, которая не является пробелом включительно.
        //Этот метод можно использовать для удаления пробелов с начала и конца строки.
        System.out.println(stringTrim02.strip());
        // strip() определяет, является ли символ пробелом или нет, основываясь на Character.isWhitespace().
        // Другими словами, он знает о разных пробельных символах Unicode.
        System.out.println(Character.isWhitespace('\u2001'));

        // Метод stripLeading()
        // 1. Возвращает строку, значением которой является эта строка,
        // с удалением всех начальных пробелов
        // 2. .stripLeading()
        // 4. возвращается строка, значением которой является эта строка,
        // со всеми удаленными пробелами в начале
        System.out.println(stringTrim01.stripLeading());

        // Метод stripTrailing()
        // 1. Возвращает строку, значением которой является эта строка,
        // с удалением всех конечных пробелов
        // 2. .stripTrailing()
        // 4. возвращается строка, значением которой является эта строка,
        // со всеми удаленными пробелами в конце
        System.out.println(stringTrim01.stripTrailing());

        // Метод stripIndent()
        // удаляет пробелы из каждой линии строки
        // Возвращает строку, значением которой является эта строка,
        // с удалением случайных пробелов в начале и в конце каждой строки.
        System.out.println(stringTrim01.stripIndent());

        // compareTo
        // 1. Сравнивает две строки лексикографически c учетом регистра
        // 2. .compareTo()
        // 4. int, значение 0, если строка аргумента равна этой строке; значение меньше 0,
        // если эта строка лексикографически меньше строкового аргумента;
        // и значение больше 0, если эта строка лексикографически больше строкового аргумента.
        // сравнение символов по таблице Unicode
        String stringompateTo01 = "Welcome";
        String stringompateTo02 = "welcome";
        System.out.println(stringompateTo01.compareTo(stringompateTo02)); // -32
        System.out.println(stringompateTo02.compareTo(stringompateTo01)); // 32
        char a = 'W';
        char b = 'w';
        System.out.println((int) a); // 'W' = 87
        System.out.println((int) b); // 'w' = 119, поэтому разница -32

        // compareToIgnoreCase
        // 1. Сравнивает две строки лексикографически без учета регистра
        // 2. .compareToIgnoreCase(number02)
        System.out.println(stringompateTo02.compareToIgnoreCase(stringompateTo01)); // 0

        // isEmpty
        // 1. Возвращает true тогда и только тогда, когда length() равно 0.
        //
        String stringIsEmpty01 = "";
        String stringIsEmpty02 = " ";
        System.out.println(stringIsEmpty01.isEmpty());
        System.out.println(stringIsEmpty02.isEmpty());

        // isBlank
        // 1. Возвращает true, если строка пуста или
        // содержит только кодовые точки с пробелами, в противном случае — false.
        System.out.println(stringIsEmpty01.isBlank());
        System.out.println(stringIsEmpty02.isBlank()); // т.к. есть пробел, если добавить не пробелы, то false

        // repeat
        // 1. Возвращает строку, значение которой является конкатенацией этой строки,
        // повторенной n количество раз.
        // Если эта строка пуста или число равно нулю, возвращается пустая строка.
        // 2. .repeat( int count)
        // count - количество повторений
        String stringRepeat01 = "Hello";
        System.out.println(stringRepeat01.repeat(2)); // HelloHelloHelloHello

        // toLowerCase()
        // 1. Преобразует все символы этой строки в нижний регистр, используя правила локали по умолчанию.
        // Этот метод эквивалентен toLowerCase(Locale.getDefault()).
        // 4. Строка, преобразованная в нижний регистр

        String stringToLowerCase = "СТРОКА";
        System.out.println(stringToLowerCase.toLowerCase());

        // toUpperCase()
        // 1. Преобразует все символы этой строки в верхний регистр, используя правила данной локали.
        // Сопоставление регистра основано на стандартной версии Unicode, заданной классом символов.
        // Поскольку сопоставления регистра не всегда являются сопоставлениями символов 1:1,
        // результирующая строка и эта строка могут отличаться по длине.
        // 4. Строка, преобразованная в верхний регистр
        String stringToUpperCase = "строка";
        System.out.println(stringToLowerCase.toUpperCase());

        // chatAt
        // 1. Возвращает значение char по указанному индексу.
        // Индекс находится в диапазоне от 0 до length() - 1.
        // Первое символьное значение последовательности имеет индекс 0,
        // следующее — индекс 1 и т. д., как при индексации массива.
        // 2. harAt(int index)
        // 3. index - индекс значения char, номер символа
        // 4. значение char по указанному индексу этой строки.
        // Первое значение char находится в индексе 0.

        String stringCharAt01 = "Строка";
        System.out.println(stringCharAt01.charAt(2));
    }
}

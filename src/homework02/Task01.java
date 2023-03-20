package homework02;

public class Task01 {
    public static void main(String[] args) {
        int number01 = 9; // присвоили целочисленной переменной a значение 10
        int number02 = 12; // присвоили целочисленной переменной b знчение 9
        // присвоим целочисленной переменной С через тернарный оператор ?
        int result01 = number01 > number02 || number01 == number02 ? number01 : number02; // если a > b или a == b, то в консоль выводится значение a, иначе b
        System.out.println(result01); //вывод значение result в консоль
    }
}

package DZ2;

import java.util.Scanner;

/**
 * Напишите программу, чтобы проверить,
 * являются ли две данные строки вращением друг друга
 * (вхождение в обратном порядке).
 * ??????? почему НЕ ЯВЛЯЕТСЯ???
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 строку ");
        String str1 = scanner.nextLine();
        System.out.println("Введите 2 строку ");
        String str2 = scanner.nextLine();
        isRotor(str2);

    }
        static void isRotor(String s){
        String s1 = s;
        String s2 = new StringBuilder(s).reverse().toString();
     //   if ()
        System.out.println(s2);
        System.out.println((s1.equals(s2)));

    }

}

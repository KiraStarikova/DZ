package DZ2;

import java.util.Scanner;

/**
 * Напишите программу,
 * чтобы перевернуть строку с помощью рекурсии.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку ");
        String s = sc.nextLine();
        isPerevernut(s);
    }

    static void isPerevernut (String s){
        String str1 = s;
        String str2 = new StringBuilder(s).reverse().toString();
        System.out.println("Перевернули: " + str2);
    }
}


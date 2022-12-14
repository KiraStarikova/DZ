package DZ2;

/**
 * Дано два числа, например 3 и 56,
 * необходимо составить следующие строки:
 * 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168
 * Используем метод StringBuilder.append().
 *
 * Замените символ “=” на слово “равно”.
 * Используйте методы StringBuilder.replace().
 *
 * Замените символ “=” на слово “равно”.
 * Используйте методы StringBuilder.insert(),
 * StringBuilder.deleteCharAt()
 */
public class Task4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int a = 3;
        int b = 56;

        sb.append(String.format("%d + %d = %d\n", a, b, a + b));
        sb.append(String.format("%d - %d = %d\n", a, b, a - b));
        sb.append(String.format("%d * %d = %d\n", a, b, a * b));
        System.out.println(sb.toString());
        System.out.println(sb.toString().replaceAll("=", "равно"));
        System.out.println(swap(String.valueOf(sb)));
    }

    public static String swap (String sb) {
        StringBuilder s = new StringBuilder(sb);
        int index = sb.indexOf("=");
        return s.deleteCharAt(index).insert(index, "равно").toString();
    }

}

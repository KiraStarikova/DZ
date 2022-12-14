package DZ2;

/**
 * **Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.
 */
public class Task7 {
    static String str() {
        String result = String.valueOf('=').repeat(10000);
        return result;
    }
    static void swap(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        for (int i = 0; i < sb.length(); i++) {
            int ind = sb.indexOf("=");
            if (ind >= 0){
                sb.replace(ind, ind+1, "равно");
            }
        }
        System.out.println(sb);
    }
    static void swapString(String str){
        str = str.replaceAll("=","равно");
        System.out.println(str);
    }

    public static void main(String[] args) {
        long st = System.currentTimeMillis();
        String s = str();
        System.out.println(s);
        swap(s);
        long end = System.currentTimeMillis();
        System.out.println(end - st+ "Выполнял StringBuilder");

        long st2 = System.currentTimeMillis();
        String s2 = str();
        System.out.println(s2);
        swapString(s2);
        long end2 = System.currentTimeMillis();
        System.out.println(end2-st2 + "Выполнял String");
    }
}


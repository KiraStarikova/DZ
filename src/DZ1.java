import java.util.Arrays;
import java.util.Random;

/**
 * 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
 * 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
 * 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
 * 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
 */
public class DZ1 {
    static int rndNum(){
        Random rnd = new Random();
        return rnd.nextInt(2001);
    }
}
    // поиск старшего бита
    static int stariy(int n){
        String s = Integer.toString(n, 2);      //в строку записывем переменную в двоичной системе
        System.out.println("число " + n + " в двоичной системе " + s + " номер старшего бита " + s.length());
        return s.length();
    }
    //создание массива м1 задача №3
    static void arr1(int a, int b){
        int[] m1 = new int[0];      //создаём массив длиной 0
        for (int i = a; i < Short.MAX_VALUE; i++) {
            if (i%b == 0){
                int[] tmp = Arrays.copyOf(m1, m1.length+1);// создаём временный массив
                tmp[m1.length] = i;
                m1 = tmp; // уравниваем по длине массивы
                m1[m1.length-1] = i;
            }
        }
        System.out.println(Arrays.toString(m1));
    }
    //создание массива м2
    static void arr2(int a, int b){
        int[] m2 = new int[0];
        for (int i = Short.MIN_VALUE; i < a; i++) {
            if (i%b == 0){
                int[] tmp = Arrays.copyOf(m2, m2.length+1);
                tmp[m2.length] = i;
                m2 = tmp;
                m2[m2.length-1] = i;
            }
        }
        System.out.println(Arrays.toString(m2));
    }
    public static void main(String[] args) {
        // в основном методе мейн вызываем методы
        int a = rndNum();
        System.out.println(a);
        int b = stariy(a);
        arr1(a, b); 
        arr2(a, b);
    }
}

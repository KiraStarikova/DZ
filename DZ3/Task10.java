package DZ3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Сравнить время работы
 * тысячи повторений пункта 3
 * для ArrayList и LinkedList.
 */
public class Task10 {

     static void simile1() {
        List<String> list = new ArrayList<String>();//(Arrays.asList("red", "orange", "yellow", "green", "blue", "violet"));
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10001; i++) {
            list.add(0, "pink");
        }
        System.out.println(list);
        long end = System.currentTimeMillis();
        System.out.println(end - start + "мс выполняли в ArrayList ");
    }

    static void simile2() {
        LinkedList<String> list = new LinkedList<String>();
//        LinkedList<String> LinkedList = list;
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 10001; i++) {
            list.add(0, "pink");
        }
        System.out.println(list);
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2 + "мс выполняли в  LinkedList");
    }

     public static void main(String[] args) {
         ArrayList<String> list = new ArrayList<String>();
         long start = System.currentTimeMillis();
         Object String;
         long end = System.currentTimeMillis();
         simile1();
         simile2();

     }
}



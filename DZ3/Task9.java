package DZ3;
/**
 list3.removeAll(list2);
 * Удалить из первого списка
 * все элементы отсутствующие во втором списке.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task9 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("black");
        list1.add("white");
        list1.add("grey");
        List<String> list2 = new ArrayList<>();
        list2.add("red");
        list2.add("green");
        list2.add("blue");
        list2.add("black");
        list2.add("grey");
        List<String> list3 = new ArrayList<>(list1);
        list3.removeAll(list2);
        list1.removeAll(list3);
        System.out.println(list1);
        Collections.sort(list2);//Сортировка списка.
        System.out.println(list2);
    }
}

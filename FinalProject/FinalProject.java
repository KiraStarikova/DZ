package DZ2;

import java.util.*;

/**
 * Объявить и инициализировать экземпляр класса HashSet. Обобщение String.
 * Добавить пять элементов в множество.
 * Отсортировать значения используя итератор.
 * Отсортированный результат сохранить в LinkedHashSet
 * Создать TreeSet с компаратором.
 * Скопировать содержимое первого множества (HashSet) в TreeSet.
 * *Скорректировать компаратор так, чтобы поля хранились в обратном порядке.
 */
public class FinalProject {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();//Объявить и инициализировать экземпляр класса HashSet. Обобщение String.
        hs.add("java");
        hs.add("python");
        hs.add("jS");
        hs.add("C#");
        hs.add("russian");
        System.out.println(hs);

        Iterator<String> it = hs.iterator();//использовали для сортировки итератор
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        while (it.hasNext()) {
            lhs.add(it.next());//Отсортированный результат сохранить в LinkedHashSet
        }
        System.out.println("Iterating over list:" + lhs);

        TreeSet<String> hs2 = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {//добавили компаратор
                return o2.compareTo(o1);//Скорректировать компаратор так, чтобы поля хранились в обратном порядке.
            }
        });
        hs2.addAll(hs);//Скопировать содержимое первого множества (HashSet) в TreeSet
        System.out.println(hs2);
    }

}

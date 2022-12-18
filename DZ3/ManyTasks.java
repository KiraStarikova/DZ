package DZ3;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Создать новый список, добавить несколько строк и вывести коллекцию на экран.
 * Итерация всех элементов списка цветов и добавления к каждому символа '!'.
 * Вставить элемент в список в первой позиции.
 * Извлечь элемент (по указанному индексу) из заданного списка.
 * Обновить определенный элемент списка по заданному индексу.
 * Удалить третий элемент из списка.
 * Поиска элемента в списке по строке.
 * Создать новый список и добавить в него несколько елементов первого списка.
 * Удалить из первого списка все элементы отсутствующие во втором списке.
 * *Сортировка списка.
 * *Сравнить время работы тысячи повторений пункта 3
 * для ArrayList и LinkedList.
 */
public class ManyTasks {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("red", "orange", "yellow", "green", "blue", "violet"));
        System.out.println(list);
        list.add("grey");
        System.out.println(list);
        for (int i = 0; i < list.size() ; i++) {
            list.set(i,list.get(i)+"!"); //Итерация всех элементов списка цветов и добавления к каждому символа '!'.
            System.out.println(list.get(i));
        }
        list.add(0, "pink"); //Вставить элемент в список в первой позиции
        System.out.println(list);
        System.out.println(list.get(5));//Извлечь элемент (по указанному индексу) из заданного списка
        list.set(4, "purple");//Обновить определенный элемент списка по заданному индексу.
        System.out.println(list);
        list.remove(5); //Удалить пятый элемент из списка
        System.out.println(list);
        if (list.contains("violet!")) {//Поиск элемента в списке по строке
            System.out.println("Слово :violet!: найдено в данной стоке");
        } else {
            System.out.println("Слово :violet!: отсутствует в данной строке");
        }

        List<String> list2 = new ArrayList<String>(Arrays.asList("flower", "book", "pen", "cat"));
        //Создать новый список
        System.out.println(list2);
        list2.addAll(2, list.subList(1,5));//добавить в него несколько элементов первого списка
        System.out.println(list2);

        }

}

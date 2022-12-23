package DZ5;
/**
 * Создать словарь HashMap. Обобщение <Integer, String>.
 * Заполнить пятью ключами (индекс, ФИО+Возраст+Пол
 * "Иванов Иван Иванович 28 м"), добавить ключь, если не было!)
 * Изменить значения сделав пол большой буквой.
 * Пройти по коллекции и вывести значения
 * в формате Фамилия инициалы "Иванов И.И."
 * *Сортировать значения по возрасту
 * и вывести отсортированную коллекция как в четвёртом пункте.
 */

import java.util.*;

public class Map {

    public static void main(String[] args) {
        HashMap<Integer, String> dict = new HashMap<>();
        dict.put(1, "Иванов Иван Иванович 30 м");
        dict.put(2, "Петров Пётр Петрович 53 м");
        dict.put(3,"Сидоров Сидор Сидорович 46 м");
        dict.put(4, "Васильев Василий Васильевич 38 м");
        dict.put(5, "Егоров Егор Егорович 23 м");
        Set<Integer> keys = dict.keySet();
        for (Integer key: keys
            ) {
            String temp1 = dict.get(key).split(" ")[0];
            String tmp = temp1.toUpperCase().charAt(0) + temp1.toLowerCase().substring(1, temp1.length());
            temp1 = dict.get(key).split(" ")[1].toUpperCase().charAt(0) + ".";//вывести значения в формате Фамилия инициалы "Иванов И.И.
            tmp = tmp + " " + temp1;
            temp1 = dict.get(key).split(" ")[2].toUpperCase().charAt(0) + ".";
            tmp = tmp + temp1;
            temp1 = dict.get(key).split(" ")[4].toUpperCase().charAt(0) + " ";//Изменить значения сделав пол большой буквой.
            tmp = tmp + " " + temp1;
            System.out.println(tmp);
        }
        LinkedList<Integer>ar1 = new LinkedList<>();
        Collection<String> key = dict.values();
        for (int i = 0; i < key.size(); i++) {
            System.out.println(key.toArray()[i]);
            ar1.add(Integer.parseInt(key.toArray()[i].toString().split(" ")[3]));

        }
        System.out.println(ar1);
        LinkedList<Integer> ar2 = ar1;
        Collections.sort(ar2);
        System.out.println(ar2);



    }
}

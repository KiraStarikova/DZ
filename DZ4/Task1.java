package DZ4;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Написать приложение для ввода ФИО, возраста и пола пользователей. Данные хранить в разных списках.
 * Добавить методы для сортировки пользователей по возрасту полу и первой букве фамилии.
 * *Добавить возможность одновременной сортировки по двум параметрам.
 * **Добавить возможность одновременной сортировки по трём параметрам.
 */
public class Task1 {
    static ArrayList fill(ArrayList<String>fio){//создаём список
        fio.add("Ступин Игорь Павлович 26 м");
        fio.add("Смирнов Валентин Сергеевич 38 м");
        fio.add("Силина Валентина Ивановна 25 ж");
        fio.add("Залипухина Вера Заировна 48 ж");
        fio.add("Ступин Иван Иванович 58 м");
        fio.add("Кривицына Екатерина Васильевна 45 ж");
        fio.add("Бухарин Павел Александрович 49 м");
        fio.add("Вирова Анна Кирилловна 51 ж");
        return fio;
    }

    static void printList(ArrayList<String>fio){
        for (int i = 0; i < fio.size(); i++) {
            System.out.println(fio.get(i));

        }
    }

    static void genderSort(ArrayList<String>fio){
        ArrayList<String>male = new ArrayList<>();
        ArrayList<String>female = new ArrayList<>();
        for (int i = 0; i < fio.size(); i++) {
            if (fio.get(i).split(" ")[4].equalsIgnoreCase("М")){//сортировка по полу
                male.add(fio.get(i));
            }
            else female.add(fio.get(i));
        }
        Collections.sort(male);
        Collections.sort(female);
        fio.clear();
        fio.addAll(male);
        fio.addAll(female);
        printList(fio);
    }
    public static void main(String[] args) {
        ArrayList<String>people = new ArrayList<>();
        people = fill(people);
        //printList(people);
        genderSort(people);//сортировка по алфавиту
    }
}

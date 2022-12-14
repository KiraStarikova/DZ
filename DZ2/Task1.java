package DZ2;

/**
 * Напишите программу, чтобы найти вхождение в строке
 * (содержащей все символы другой строки).
 */
public class Task1 {
    public static void main(String[] args) {
        String str1 = "fhgj tuyh skgl";
        String str2 = "mh";
        if (str1.contains(str2)){
            System.out.println("Входит");
        }
        else System.out.println("Не входит");
        if (str1.contains("uy")){
            System.out.println("Входит");
        }
        else System.out.println("Не входит");
    }
}

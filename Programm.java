import java.util.*;

public class Programm {
    // Вариаент A задание 2 Отобразить в окне консоли аргументы командной строки в обратном порядке.
    // Вариант Б задание 8 Числа в порядке убывания частоты встречаемости чисел. функция con
    public static void main (String string[]){
        for (int i = string.length - 1; i >= 0; i--){
            System.out.println(string[i]);
        }

        con();
    }

    public static void con(){
        HashMap<Integer, Integer> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько чисел ввести?");
        int num = in.nextInt();
        System.out.println("Введите " + num + " чисел!");

        for(int i =0; i < num; i++){
            int elem = in.nextInt();
            map.put(elem, map.getOrDefault(elem, 0) + 1);
        }



        System.out.println(map);
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        for(int j =0; j < list.size(); j++){
            int v = 0;
            int k = -1;
            for(int i =0; i < list.size(); i++){
                int m = list.get(i);
                if(map.get(m) > v){
                    v = map.get(m);
                    k = list.get(i);
                }
            }
            System.out.println(k + " : " + map.get(k));
            map.replace(k,0);

        }



    }
}

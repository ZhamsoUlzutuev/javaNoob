import java.util.*;

public class Programm {
    //задание 1
    public static void main (String string[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ИМЯ епт!");
        String name = in.nextLine();
        System.out.println("ПРИВЕТ " + name + " епт");

// задание 2 Отобразить в окне консоли аргументы командной строки в обратном порядке.
        for (int i = string.length - 1; i >= 0; i--){
            System.out.println(string[i]);
        }

//задание 3
        System.out.println("Введите число епт");
        int r = in.nextInt();
        ran(r);

        System.out.println("Введи пароль епт");
        String ps = in.next();
        pswd(ps);

        //con();
    }



    public static void pswd(String ff){

        String str = "Password123";
        if(str.equals(ff)){
            System.out.println("Сходится епт");
        }else System.out.println("Не сходится епт");
    }

    public static void ran(int n){
        System.out.println("введите количество чисел!");
        System.out.println("С переносом строки");
        for(int i = 0; i < n; i++){
            int r = (int) Math.round(Math.random() * 100);
            System.out.println(r);
        }
        System.out.println("Без переноса строки");
        for(int i = 0; i < n; i++){
            int r = (int) Math.round(Math.random() * 100);
            System.out.print(" " + r + " \n");
        }
    }

// Вариант Б задание 8 Числа в порядке убывания частоты встречаемости чисел. функция con
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

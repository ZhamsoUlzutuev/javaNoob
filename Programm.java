import java.time.ZonedDateTime;
import java.util.*;

public class Programm {
    //задание 1
    public static void main (String[] string){
        Scanner in = new Scanner(System.in);
        System.out.println("ЗАДАНИЕ 1");
        System.out.println("Введите ИМЯ епт!");
        String name = in.nextLine();
        System.out.println("ПРИВЕТ " + name + " епт");

// задание 2 Отобразить в окне консоли аргументы командной строки в обратном порядке.
        System.out.println("ЗАДАНИЕ 2");
        for (int i = string.length - 1; i >= 0; i--){
            System.out.println(string[i]);
        }

//задание 3
        System.out.println("ЗАДАНИЕ 3");
        System.out.println("Введите число епт");
        int r = in.nextInt();
        ran(r);

        System.out.println("ЗАДАНИЕ 4");
        System.out.println("Введи пароль епт");
        String ps = in.next();
        pswd(ps);

        System.out.println("ЗАДАНИЕ 5");
        sumANDmulti();
        //con();

        System.out.println("ЗАДАНИЕ 6");
        info(name);
    }

    public static void info(String name){
        System.out.println("ТИпо разраб = " + name);
        System.out.println("Дата получения задания: 27.01.2026");
        System.out.println(ZonedDateTime.now());
    }

    public static void sumANDmulti(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число епт");
        int x = in.nextInt();
        int s = 0;
        int m = 1;
        for(int i = 0; i < x; i++){
            int a = in.nextInt();
            s += a;
            m *= a;
        }
        System.out.println("Сумма: " + s + " Произведение: " + m);

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

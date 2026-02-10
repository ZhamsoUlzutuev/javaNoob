import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class program2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();//для длин
        ArrayList<String> list1 = new ArrayList<String>();//для значений
        int n = in.nextInt();


        for(int i = 0; i < n; i++){
            int ch = in.nextInt();
            list1.add(String.valueOf(ch));
            list.add(String.valueOf(ch).length());
        }

        //mm(list);
        bub(list1);
    }

    public static void bub(ArrayList<String> list){
        for(int i = 0; i < list.size(); i++){
            for(int j = 1; j < list.size() - i; j++){
                if(list.get(j-1).length() > list.get(j).length());
                String temp = list.get(j-1);
                list.get(j-1) = list.get(j);
                list.get(j) = temp;
            }
        }
    }

    public static void mm(ArrayList<Integer> list){
        int max = 1;
        int min = 1;

        for(int i : list){
            if(i > max){
                max = i;
            }
            if(i < min ){
                min = i;
            }
        }

        System.out.println("максимум: " + max);
        System.out.println("минимум" + min);
    }
}

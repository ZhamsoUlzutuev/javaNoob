import java.util.ArrayList;
import java.util.Scanner;

public class program2 {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();//для длин
        ArrayList<String> list1 = new ArrayList<String>();//для длин
        int n = in.nextInt();
        String[] arr = new String[n];

        for(int i = 0; i < n; i++){
            int ch = in.nextInt();
            arr[i] = String.valueOf(ch);
            list.add(String.valueOf(ch).length());
            list1.add(String.valueOf(ch));
        }
        //mm(list);
        //bub(arr);
        middle(list1);
    }

    public static void middle(ArrayList<String> list){
        int cout = 0;
        for(int i = 0; i < list.size(); i++){
            cout += list.get(i).length();
        }
        int mid = cout / list.size();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).length() > mid){
                System.out.println(list.get(i) + " len: " + list.get(i).length() );
            }
            else System.out.println(list.get(i) + " len: " + list.get(i).length() );
        }
    }

///2
    public static void bub(String[] arr){
        for(int i = 0; i < arr.length ; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[i].length() > arr[i+1].length()) {
                    String temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
///1
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

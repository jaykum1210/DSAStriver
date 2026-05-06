package Arrays.Easy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Question3 {
    public static boolean sort(ArrayList<Integer> arr){
        for (int i = 0;i<arr.size()-1;i++){
            if (arr.get(i)>arr.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        for (int i = 0;i<a;i++){
            arr.add(sc.nextInt());
        }
        System.out.println("Sorted : " + sort(arr));
    }
}

package LearnBasics.BasicMaths;

import java.util.ArrayList;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1;i<=a;i++){
            if (a%i==0){
                list.add(i);
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        System.out.println("Array : ");
        for (int i = 0;i<list.size();i++){
            System.out.print(arr[i] + " ");
        }
    }
}

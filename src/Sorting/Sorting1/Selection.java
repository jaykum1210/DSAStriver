package Sorting.Sorting1;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Selection {
    public static int[] select(int[] arr){
        int len = arr.length;
        for (int i = 0;i<len;i++){
            int min = i;
            for (int j = i;j<len;j++){
                if (arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int[] result = select(arr);
        System.out.println("Array : ");
        for (int e : arr){
            System.out.print(e + " ");
        }
    }
}

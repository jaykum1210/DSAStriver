package Sorting.Sorting1;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Insertion {
    public static int[] inser(int[] arr){
        int len = arr.length;
        for (int i = 0;i<len;i++){
            int j = i;
            while (j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
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
        int[] result = inser(arr);
        System.out.println("Array : ");
        for (int e : result){
            System.out.print(e + " ");
        }
    }
}

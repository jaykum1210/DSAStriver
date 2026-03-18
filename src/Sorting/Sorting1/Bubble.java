package Sorting.Sorting1;

import java.util.Scanner;

public class Bubble {
    public static int[] bub(int[] arr){
        int len = arr.length;
        for (int i = 0;i<len-1;i++){
            for (int j = 0;j<len-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
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
        int[] result = bub(arr);
        System.out.println("Array : ");
        for (int e : result){
            System.out.print(e + " ");
        }
    }
}

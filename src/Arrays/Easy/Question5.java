package Arrays.Easy;

import java.util.Scanner;

public class Question5 {
    public static void reverse(int[] arr, int start, int end){
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotateArraytoLeft(int[] arr, int b){
        reverse(arr,0,b-1);
        reverse(arr,b,arr.length-1);
        reverse(arr,0,arr.length-1);
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
        System.out.println("Enter Position : ");
        int b = sc.nextInt();
        b = b%arr.length;
        rotateArraytoLeft(arr,b);
        System.out.println("Array : ");
        for (int e : arr){
            System.out.print(e + " ");
        }
    }
}

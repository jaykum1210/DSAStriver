package LearnBasics.Recursion;

import java.util.Scanner;

public class Question5 {
    public static void revarr(int[] arr, int a){
        for (int i = 0;i<a/2;i++){
            int temp = arr[i];
            arr[i] = arr[a-i-1];
            arr[a-i-1] = temp;
        }
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
        revarr(arr,a);
        System.out.println("Array : ");
        for (int e : arr){
            System.out.print(e + " ");
        }
    }
}

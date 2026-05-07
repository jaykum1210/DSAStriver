package Arrays.Easy;

import java.util.HashSet;
import java.util.Scanner;

public class Question9 {
    public static int[] unionArray(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for (int i = 0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        int i = 0;
        int[] arr = new int[set.size()];
        for (int e : set){
            arr[i++] = e;
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr1 = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter Size : ");
        int b = sc.nextInt();
        int[] arr2 = new int[b];
        System.out.println("Enter " + b + " Elements : ");
        for (int i = 0;i<b;i++){
            arr2[i] = sc.nextInt();
        }
        int[] arr = unionArray(arr1,arr2);
        System.out.println("Array : ");
        for (int e : arr){
            System.out.print(e + " ");
        }
    }
}

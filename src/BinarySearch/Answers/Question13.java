package BinarySearch.Answers;

import java.util.Scanner;

public class Question13 {
    public static double median(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0, j = 0;
        int prev = 0, curr = 0;
        for (int count = 0; count <= (m + n) / 2; count++) {
            prev = curr;
            if (i == m) {
                curr = arr2[j++];
            }
            else if (j == n) {
                curr = arr1[i++];
            }
            else if (arr1[i] < arr2[j]) {
                curr = arr1[i++];
            }
            else {
                curr = arr2[j++];
            }
        }
        if ((m + n) % 2 == 0) {
            return (prev + curr) / 2.0;
        }
        return curr;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        System.out.println("Enter Size : ");
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
        System.out.println("Number : " + median(arr1,arr2));
    }
}

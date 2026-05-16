package BinarySearch.Answers;

import java.util.Scanner;

public class Question11 {
    public static int paint(int A, int B, int[] C){
        int max = 0;
        for (int e : C){
            if (e>max) max = e;
        }
        return ((B*max)%10000003);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Painters : ");
        int A = sc.nextInt();
        System.out.println("Enter Units of times : ");
        int B = sc.nextInt();
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Time : " + paint(A,B,arr));
    }
}

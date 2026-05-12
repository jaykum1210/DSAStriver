package BinarySearch.Answers;

import java.util.Scanner;

public class Question2 {
    public static int roseGarden(int n, int[] nums, int k, int m){
        int x = k*m;
        return nums[x];
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
        System.out.println("Number of adjacent roses : ");
        int k = sc.nextInt();
        System.out.println("Number of Bouquet : ");
        int m = sc.nextInt();
        System.out.println("Number : " + roseGarden(a,arr,k,m));
    }
}

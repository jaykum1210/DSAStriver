package BinarySearch.Answers;

import java.util.Scanner;

public class Question7 {
    public static int findKthPositive(int[] arr, int k){
        int x = 0;
        int ans = 0;
        for (int i = 1;k>=1;i++){
            if (i==arr[x] && x<arr.length){
                x++;
            }
            else{
                k--;
                ans = i;
            }
        }
        return ans;
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
        System.out.println("Enter Number : ");
        int b = sc.nextInt();
        System.out.println("Minimum Capacity : " + findKthPositive(arr,b));
    }
}

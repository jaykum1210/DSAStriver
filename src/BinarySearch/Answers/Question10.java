package BinarySearch.Answers;

import java.util.Scanner;

public class Question10 {
    public static int largestSubarraySumMinimized(int[] a, int k){
        int ans = 0;
        int max = 0;
        int total = 0;
        for (int e : a){
            if (e>max) max = e;
            total+=e;
        }
        int left = max;
        int right = total;
        while (left<=right){
            int x = 1;
            int sum = 0;
            int mid = left + (right-left)/2;
            for (int i = 0;i<a.length;i++){
                sum+=a[i];
                if (sum>mid){
                    x++;
                    sum = a[i];
                }
            }
            if (x<=k){
                ans = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
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
        int m = sc.nextInt();
        System.out.println("Sum : " + largestSubarraySumMinimized(arr,m));
    }
}

package BinarySearch.Answers;

import java.util.Scanner;

public class Question4 {
    public static int roseGarden(int n, int[] nums, int k, int m){
        if (nums.length<m*k){
            return -1;
        }
        int max = nums[0];
        for (int e : nums){
            if (e>max) max = e;
        }
        int min = max+1;
        int left = 0;
        int right = max;
        while (left<=right){
            int mid = left + (right-left)/2;
            int count = 0;
            int x = 0;
            for (int i = 0;i<nums.length;i++){
                if (nums[i]<=mid){
                    count++;
                    if (count==k){
                        count = 0;
                        x++;
                    }
                }
                else{
                    count = 0;
                }
            }
            if (x>=m){
                min = mid;
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        if (min<max+1) return min;
        return -1;
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
        System.out.println("Enter Number of bouquets : ");
        int m = sc.nextInt();
        System.out.println("Enter Number os flowers needed : ");
        int k = sc.nextInt();
        int x = roseGarden(a,arr,k,m);
        System.out.println("Minimum Days : " + x);
    }
}

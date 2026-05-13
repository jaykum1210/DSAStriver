package Sorting.Sorting2;

import java.util.Scanner;

public class Question2 {
    public static void bubble(int[] nums, int n){
        if (n==0){
            return;
        }
        for (int i = 0;i<n-1;i++){
            if (nums[i]>nums[i+1]){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }
        bubble(nums,n-1);
    }
    public static int[] bubbleSort(int[] nums){
        bubble(nums,nums.length);
        return nums;
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
        int[] nums = bubbleSort(arr);
        System.out.println("Array : ");
        for (int e : nums){
            System.out.print(e + " ");
        }
    }
}

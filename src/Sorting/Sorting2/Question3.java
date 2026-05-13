package Sorting.Sorting2;

import java.util.Scanner;

public class Question3 {
    public static void insert(int[] nums, int i, int j){
        if (j<=0 || nums[j]>=nums[j-1]){
            return;
        }
        int temp = nums[j];
        nums[j] = nums[j-1];
        nums[j-1] = temp;
        insert(nums,i,j-1);
    }
    public static void sort(int[] nums, int i){
        if(i==nums.length){
            return;
        }
        insert(nums,i,i);
        sort(nums,i+1);
    }
    public static int[] insertionSort(int[] nums){
        sort(nums,1);
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
        int[] nums = insertionSort(arr);
        System.out.println("Array : ");
        for (int e : nums){
            System.out.print(e + " ");
        }
    }
}

package BinarySearch.OneD;

import java.util.Scanner;

public class Question4 {
    public static int searchInsert(int[] nums, int target){
        for (int i = 0;i<nums.length;i++){
            if (nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for(int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target : ");
        int target = sc.nextInt();
        System.out.println("Index : " + searchInsert(arr,target));
    }
}
package BinarySearch.OneD;

import java.util.Scanner;

public class Question9 {
    public static boolean search(int[] nums, int target){
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for(int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }System.out.println("Enter Target : ");
        int target = sc.nextInt();
        System.out.println("Index : " + search(arr,target));
    }
}

package BinarySearch.OneD;

import java.util.Scanner;

public class Question3 {
    public static int upperBound(int[] nums, int x){
        for (int i = 0;i<nums.length;i++){
            if (nums[i]>x){
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
        System.out.println("Index : " + upperBound(arr,target));
    }
}

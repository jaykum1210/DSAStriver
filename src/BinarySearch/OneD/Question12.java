package BinarySearch.OneD;

import java.util.HashMap;
import java.util.Scanner;

public class Question12 {
    public static int singleNonDuplicate(int[] nums){
        for (int i = 0;i<nums.length;i+=2){
            if (nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        return -1;
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
        System.out.println("Number : " + singleNonDuplicate(arr));
    }
}

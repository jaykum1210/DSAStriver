package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question6 {
    public static int[] rearrangeArray(int[] nums){
        int[] arr = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 0){
                arr[pos] = nums[i];
                pos += 2;
            }
            else{
                arr[neg] = nums[i];
                neg += 2;
            }
        }
        return arr;
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
        int[] arr1 = rearrangeArray(arr);
        System.out.println("Array : ");
        for (int e : arr1){
            System.out.print(e + " ");
        }
    }
}

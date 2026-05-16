package LeetCode;

import java.util.Scanner;

public class RotateFunction {
    public static int maxRotateFunction(int[] nums){
        int ans = Integer.MIN_VALUE;
        for (int i = 0;i< nums.length;i++){
            int sum = 0;
            for (int j = 0;j<nums.length;j++){
                sum+=(j*nums[(i+j)%nums.length]);
            }
            if (sum>ans) ans = sum;
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
        System.out.println("Maximum Number : " + maxRotateFunction(arr));
    }
}

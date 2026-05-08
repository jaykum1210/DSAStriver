package Arrays.Medium;

import java.util.Scanner;

public class Question13 {
    public static int subarraySum(int[] nums, int k){
        int sum = 0;
        int count = 0;
        for (int i = 0;i<nums.length;i++){
            sum=nums[i];
            if (sum==k) count++;
            for (int j = i+1;j<nums.length;j++){
                sum+=nums[j];
                if (sum==k) count++;
            }
        }
        return count;
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
        int k = sc.nextInt();
        int num = subarraySum(arr,k);
        System.out.println("Number : " + num);
    }
}

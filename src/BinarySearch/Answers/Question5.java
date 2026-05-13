package BinarySearch.Answers;

import java.util.Scanner;

public class Question5 {
    public static int smallestDivisor(int[] nums, int limit){
        int max = nums[0];
        for (int e : nums){
            if (e>max) max = e;
        }
        int left = 1;
        int right = max;
        int num = max;
        while (left<=right){
            int sum = 0;
            int mid = left + (right-left)/2;
            for(int e : nums){
                sum+=(int)(Math.ceil((double) e/mid));
            }
            if (sum<=limit){
                num = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return num;
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
        System.out.println("Enter limit : ");
        int k = sc.nextInt();
        System.out.println("Value : " + smallestDivisor(arr,k));
    }
}

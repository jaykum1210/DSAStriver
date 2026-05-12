package BinarySearch.Answers;

import java.util.Arrays;
import java.util.Scanner;

public class Question3 {
    public static int minimumRateToEatBananas(int[] nums, int h){
        int k = 0;
        int max = nums[0];
        for (int e : nums){
            if (e>max) max = e;
        }
        int low = 1;
        int high = max;
        int ans = max;
        while (low<=high){
            int mid = low + (high-low)/2;
            long hours = 0;
            for (int e : nums) {
                hours += (e + mid - 1) / mid;
            }
            if (hours <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
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
        System.out.println("Enter Hours : ");
        int b = sc.nextInt();
        int k = minimumRateToEatBananas(arr,b);
        System.out.println("Minimum Speed : " + k);
    }
}

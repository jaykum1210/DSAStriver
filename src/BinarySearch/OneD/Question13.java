package BinarySearch.OneD;

import java.util.Scanner;

public class Question13 {
    public static int findPeakElement(int[] nums){
        int n = nums.length;
        if (n == 1) {
            return 0;
        }
        if (nums[0] > nums[1]) {
            return 0;
        }
        if (nums[n - 1] > nums[n - 2]) {
            return n - 1;
        }
        for (int i = 1; i < n - 1; i++) {
            if (nums[i] > nums[i - 1] &&nums[i] > nums[i + 1]) {
                return i;
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
        System.out.println("Number : " + findPeakElement(arr));
    }
}

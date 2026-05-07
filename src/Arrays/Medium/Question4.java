package Arrays.Medium;

import java.util.Scanner;

public class Question4 {
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];
        for(int e : nums){
            sum += e;
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
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
        System.out.println("Sum : " + maxSubArray(arr));
    }
}

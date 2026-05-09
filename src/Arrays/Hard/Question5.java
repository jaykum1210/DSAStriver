package Arrays.Hard;

import java.util.Scanner;

public class Question5 {
    public static int maxLen(int[] nums){
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                if(sum == 0){
                    int len = j - i + 1;
                    if(len > max){
                        max = len;
                    }
                }
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
        for(int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Largest Subarray : " + maxLen(arr));
    }
}

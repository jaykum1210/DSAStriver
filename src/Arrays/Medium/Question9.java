package Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class Question9 {
    public static int longestConsecutive(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int count = 1;
        int max = 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i + 1] - nums[i] == 1){
                count++;
            }
            else if(nums[i + 1] - nums[i] == 0){
                continue;
            }
            else{
                if(count > max){
                    max = count;
                }
                count = 1;
            }
        }
        if(count > max){
            max = count;
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
        int num = longestConsecutive(arr);
        System.out.println("Number : " + num);
    }
}

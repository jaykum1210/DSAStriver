package Arrays.Hard;

import java.util.HashMap;
import java.util.Scanner;

public class Question6 {
    public static int subarraysWithXorK(int[] nums, int k){
        int count = 0;
        for (int i = 0;i<nums.length-1;i++){
            int sum = 0;
            for (int j = i;j<nums.length;j++){
                sum^=nums[j];
                if ((sum)==k) count++;
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
        for(int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Number : ");
        int k = sc.nextInt();
        System.out.println("Numbers : " + subarraysWithXorK(arr,k));
    }
}

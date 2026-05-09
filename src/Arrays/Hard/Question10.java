package Arrays.Hard;

import java.util.Scanner;

public class Question10 {
    public static int numberOfInversions(int[] nums){
        int count = 0;
        for (int i = 0;i<nums.length-1;i++){
            for (int j = i+1;j<nums.length;j++){
                if (nums[i]>nums[j]){
                    count++;
                }
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
        System.out.println("Inversions : " + numberOfInversions(arr));
    }
}

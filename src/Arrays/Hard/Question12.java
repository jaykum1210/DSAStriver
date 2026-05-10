package Arrays.Hard;

import java.util.Scanner;

public class Question12 {
    public static int maxProduct(int[] nums){
        int max = 0;
        for (int i = 0;i<nums.length-1;i++){
            int mul = 1;
            for (int j = i;j<nums.length;j++){
                mul*=nums[j];
                if (mul>max) max = mul;
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
        System.out.println("Product : " + maxProduct(arr));
    }
}

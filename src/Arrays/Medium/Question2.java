package Arrays.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Question2 {
    public static void sortZeroOneTwo(int[] nums){
        int zero = 0;
        int one = 0;
        int two = 0;
        for (int i = 0;i<nums.length;i++){
            if (nums[i] == 0) zero++;
            else if (nums[i] == 1) {
                one++;
            }
            else {
                two++;
            }
        }
        int x = 0;
        for (int i = 0;i<zero;i++){
            nums[x++] = 0;
        }
        for (int i = 0;i<one;i++){
            nums[x++] = 1;
        }
        for (int i = 0;i<two;i++){
            nums[x++] = 2;
        }
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
        sortZeroOneTwo(arr);
        System.out.println("Array : ");
        for (int e : arr){
            System.out.print(e + " ");
        }
    }
}

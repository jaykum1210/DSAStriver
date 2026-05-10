package BinarySearch.OneD;

import java.util.Scanner;

public class Question5 {
    public static int[] getFloorAndCeil(int[] nums, int x) {
        int[] arr = {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= x) {
                arr[0] = nums[i];
            }
            if (nums[i] >= x) {
                arr[1] = nums[i];
                break;
            }
        }
        return arr;
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
        System.out.println("Enter Target : ");
        int target = sc.nextInt();
        int[] num = getFloorAndCeil(arr,target);
        System.out.println("Array : ");
        for (int e : num){
            System.out.print(e);
        }
    }
}

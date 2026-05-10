package BinarySearch.OneD;

import java.util.Scanner;

public class Question8 {
     public static int search(int[] nums, int target) {
            int low = 0;
            int high = nums.length - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (nums[mid] == target) {
                    return mid;
                }
                if (nums[low] <= nums[mid]) {
                    if (target >= nums[low] && target < nums[mid]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
                else {
                    if (target > nums[mid] && target <= nums[high]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
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
        }System.out.println("Enter Target : ");
        int target = sc.nextInt();
        System.out.println("Index : " + search(arr,target));
    }
}

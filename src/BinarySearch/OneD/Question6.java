package BinarySearch.OneD;

import java.util.Scanner;

public class Question6 {
    public static int first(int[] nums,int target){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while (low<=high){
            int mid = (low+high)/2;
            if (nums[mid]==target){
                ans = mid;
                high = mid-1;
            } else if (nums[mid] > target) {
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static int last(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while (low<=high){
            int mid = (low+high)/2;
            if (nums[mid]==target){
                ans = mid;
                low = mid+1;
            } else if (nums[mid] > target) {
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static int[] searchRange(int[] nums, int target){
        int left = first(nums,target);
        int right = last(nums,target);
        return new int[]{left,right};
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
        int[] num = searchRange(arr,target);
        System.out.println("Array : ");
        for (int e : num){
            System.out.print(e);
        }
    }
}

package Sorting.Sorting2;

import java.util.Scanner;

public class Question1 {
    public static void merge(int[] nums, int low, int mid, int high){
        int[] temp = new int[high-low+1];
        int left = low;
        int right = mid+1;
        int k = 0;
        while (left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                temp[k] = nums[left];
                left++;
            }
            else {
                temp[k] = nums[right];
                right++;
            }
            k++;
        }
        while(left<=mid){
            temp[k] = nums[left];
            left++;
            k++;
        }
        while(right<=high){
            temp[k] = nums[right];
            right++;
            k++;
        }
        for(int i = 0;i<temp.length;i++){
            nums[low+i] = temp[i];
        }
    }
    public static void sort(int[] nums, int low, int high){
        if(low>=high){
            return;
        }
        int mid = low + (high-low)/2;
        sort(nums,low,mid);
        sort(nums,mid+1,high);
        merge(nums,low,mid,high);
    }
    public static int[] mergeSort(int[] nums){
        sort(nums,0,nums.length-1);
        return nums;
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
        int[] nums = mergeSort(arr);
        System.out.println("Array : ");
        for (int e : nums){
            System.out.print(e + " ");
        }
    }
}

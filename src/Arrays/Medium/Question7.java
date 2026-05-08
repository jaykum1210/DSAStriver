package Arrays.Medium;

import java.util.Scanner;

public class Question7 {
    public static int nextMax(int[] nums, int start, int end,int pivot){
        int max = Integer.MAX_VALUE;
        int maxindex = 0;
        for (int i = start;i<=end;i++){
            if (nums[i]>pivot && nums[i]<max){
                max = nums[i];
                maxindex = i;
            }
        }
        return maxindex;
    }
    public static void reverse(int[] nums, int pivot, int end){
        while (pivot<end){
            int temp = nums[pivot];
            nums[pivot] = nums[end];
            nums[end] = temp;
            pivot++;
            end--;
        }
    }
    public static void nextPermutation(int[] nums){
        int pivot = -1;
        for (int i = nums.length-1;i>0;i--){
            if (nums[i]>nums[i-1]){
                pivot = i-1;
                break;
            }
        }
        if (pivot!=-1){
            int max = nextMax(nums,pivot+1,nums.length-1, nums[pivot]);
            int temp = nums[max];
            nums[max] = nums[pivot];
            nums[pivot] = temp;
        }
        reverse(nums,pivot+1,nums.length-1);
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
        nextPermutation(arr);
        System.out.println("Array : ");
        for (int e : arr){
            System.out.print(e + " ");
        }
    }
}

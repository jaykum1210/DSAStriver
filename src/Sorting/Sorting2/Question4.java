package Sorting.Sorting2;

import java.util.Scanner;
public class Question4 {
        public static void quick(int[] nums, int low, int high) {
            if (low >= high) {
                return;
            }
            int pivot = partition(nums, low, high);
            quick(nums, low, pivot - 1);
            quick(nums, pivot + 1, high);
        }
        public static int partition(int[] nums, int low, int high) {
            int pivot = nums[low];
            int i = low;
            int j = high;
            while (i < j) {
                while (i <= high && nums[i] <= pivot) {
                    i++;
                }
                while (j >= low && nums[j] > pivot) {
                    j--;
                }
                if (i < j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            int temp = nums[low];
            nums[low] = nums[j];
            nums[j] = temp;

            return j;
        }
        public static int[] quickSort(int[] nums) {
            quick(nums, 0, nums.length - 1);
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
        int[] nums = quickSort(arr);
        System.out.println("Array : ");
        for (int e : nums){
            System.out.print(e + " ");
        }
    }
}

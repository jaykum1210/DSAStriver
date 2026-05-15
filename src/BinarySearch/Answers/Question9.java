package BinarySearch.Answers;

import java.util.Scanner;

public class Question9 {
    public static int findPages(int[] nums,int m){
        if (m > nums.length) return -1;
        int max = 0;
        int total = 0;
        for(int e : nums){
            if (e>max) max = e;
            total+=e;
        }
        int left = max;
        int right = total;
        int ans = -1;
        while (left<=right){
            int x = 1;
            int sum = 0;
            int mid = left + (right-left)/2;
            for (int i = 0;i<nums.length;i++){
                sum+=nums[i];
                if (sum>mid){
                    x++;
                    sum = nums[i];
                }
            }
            if (x<=m){
                ans = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return ans;
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
        System.out.println("Enter Number of Students : ");
        int m = sc.nextInt();
        System.out.println("Number of Pages : " + findPages(arr,m));
    }
}

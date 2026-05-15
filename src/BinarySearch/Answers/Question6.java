package BinarySearch.Answers;

import java.util.Scanner;

public class Question6 {
    public static int shipWithinDays(int[] weights, int days){
        int ans = 0;
        int total = 0;
        int max = 0;
        for (int e : weights){
            total+=e;
            if (e>max) max = e;
        }
        int left = max;
        int right = total;
        while (left<=right){
            int mid = left+(right-left)/2;
            int x = 1;
            int sum = 0;
            for (int i = 0;i<weights.length;i++){
                sum+=weights[i];
                if (sum>mid){
                    i--;
                    x++;
                    sum=0;
                }
            }
            if (x<=days){
                ans = mid;
                right=mid-1;
            } else{
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
        System.out.println("Enter Days : ");
        int b = sc.nextInt();
        System.out.println("Minimum Capacity : " + shipWithinDays(arr,b));
    }
}

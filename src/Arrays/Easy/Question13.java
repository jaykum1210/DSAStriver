package Arrays.Easy;

import java.util.Scanner;

public class Question13 {
    public static int longestSubarray(int[] arr,int x){
        int max = 0;
        int n = arr.length;
        for (int i = 0;i<n;i++){
            int sum = 0;
            int count = 0;
            for (int j = i;j<n;j++){
                sum+=arr[j];
                if (sum==x){
                    count = j-i+1;
                    break;
                } else if (sum > x) {
                    break;
                }
            }
            if (count>max) max = count;
        }
        return max;
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
        System.out.println("Enter Sum : ");
        int x = sc.nextInt();
        System.out.println("Longest Subarray : " + longestSubarray(arr,x));
    }
}

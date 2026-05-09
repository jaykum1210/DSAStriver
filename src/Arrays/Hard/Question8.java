package Arrays.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question8 {
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int x = 0;
        int y = 0;
        for (int i = 0;i<m+n;i++){
            if (nums1[x]>nums2[y]){
                int temp = nums1[x];
                nums1[x] = nums2[y];
                nums2[y] = temp;
                x++;
                nums1[i] = nums1[x];
            }
            else {
                int temp = nums1[x];
                nums1[x] = nums2[y];
                nums2[y] = temp;
                y++;
                nums1[i] = nums1[y];
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of 1 : ");
        int m = sc.nextInt();
        System.out.println("Enter Size of 2 : ");
        int n = sc.nextInt();
        int[] arr1 = new int[m+n];
        int[] arr2 = new int[n];
        System.out.println("Enter " + m + " Elements of Array 1 : ");
        for (int i = 0;i<m+n;i++){
            if (i<m){
                arr1[i] = sc.nextInt();
            }
            else{
                arr1[i] = 0;
            }
        }
        System.out.println("Enter " + n + " Elements of Array 2 : ");
        for (int i = 0;i<n;i++){
            arr2[i] = sc.nextInt();
        }
        merge(arr1,m,arr2,n);
        System.out.println("Array : ");
        for(int e : arr1){
            System.out.print(e + " ");
        }
    }
}

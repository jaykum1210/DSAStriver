package Arrays.Easy;

import java.util.Scanner;

public class Question2 {
    public static int max(int[] arr){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i]>max2 && arr[i]!=max1){
                max2 = arr[i];
            }
        }
        if(max2 == Integer.MIN_VALUE){
            return -1;
        }
        return max2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for(int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int maximum = max(arr);
        System.out.println("Maximum Element : " + maximum);
    }
}

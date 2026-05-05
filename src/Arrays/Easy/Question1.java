package Arrays.Easy;

import java.util.Scanner;

public class Question1 {
    public static int max(int[] arr){
        int num = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>num){
                num = arr[i];
            }
        }
        return num;
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

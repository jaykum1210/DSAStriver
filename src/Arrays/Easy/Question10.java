package Arrays.Easy;

import java.util.Scanner;

public class Question10 {
    public static int missingNumber(int[] arr){
        int sum = 0;
        for(int e : arr){
            sum+=e;
        }
        int n = arr.length;
        int total = (n*(n+1))/2;
        return total-sum;
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
        int num = missingNumber(arr);
        System.out.println("Number : " + num);
    }
}

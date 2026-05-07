package Arrays.Medium;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Question1 {
    public static int[] twoSum(int[] arr, int x){
        int sum[] = new int[2];
        for (int i = 0;i<arr.length;i++){
            for (int j = i+1;j<arr.length;j++){
                if (arr[i] + arr[j] == x){
                    sum[0] = i;
                    sum[1] = j;
                }
            }
        }
        return sum;
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
        int[] sum = twoSum(arr,x);
        System.out.println("Sum Indexes : ");
        for (int e : sum){
            System.out.print(e + " ");
        }
    }
}

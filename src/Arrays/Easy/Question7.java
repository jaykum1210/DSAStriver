package Arrays.Easy;

import java.util.Scanner;

public class Question7 {
    public static void moveZeroes(int[] arr){
        int count = 0;
        int x = 0;
        for (int i = 0;i<arr.length;i++){
            if (arr[i] == 0){
                count++;
            }
            else{
                arr[x++] = arr[i];
            }
        }
        while (count!=0) {
            arr[x++] = 0;
            count--;
        }
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
        moveZeroes(arr);
        System.out.println("Array : ");
        for (int e : arr){
            System.out.print(e + " ");
        }
    }
}

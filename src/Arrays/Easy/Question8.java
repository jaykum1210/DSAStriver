package Arrays.Easy;

import java.util.Scanner;

public class Question8 {
    public static int linearSearch(int[] arr, int x){
        for (int i = 0;i<arr.length;i++){
            if (arr[i]==x){
                return i;
            }
        }
        return -1;
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
        System.out.println("Enter Number : ");
        int x = sc.nextInt();
        int index = linearSearch(arr,x);
        System.out.println("Index : " + index);
    }
}

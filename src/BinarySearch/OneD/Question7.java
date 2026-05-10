package BinarySearch.OneD;

import java.util.Scanner;

public class Question7 {
    public static int countOccurrences(int[] arr, int target){
        int count = 0;
        for (int i = 0;i<arr.length;i++){
            if (arr[i]==target){
                count++;
            } else if (arr[i] > target) {
                break;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for(int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target : ");
        int target = sc.nextInt();
        System.out.println("Number : " + countOccurrences(arr,target));
    }
}

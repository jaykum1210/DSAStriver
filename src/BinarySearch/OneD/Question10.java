package BinarySearch.OneD;

import java.util.ArrayList;
import java.util.Scanner;

public class Question10 {
    public static int findMin(ArrayList<Integer> arr){
        int min = arr.get(0);
        for (int i = 1;i<arr.size();i++){
            if (arr.get(i)<arr.get(i-1)) {
                min = arr.get(i);
                break;
            }
        }
        return min;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter " + a + " Elements : ");
        for(int i = 0; i < a; i++){
            arr.add(sc.nextInt());
        }
        System.out.println("Value : " + findMin(arr));
    }
}

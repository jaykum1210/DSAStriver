package BinarySearch.OneD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question11 {
    public static int findKRotation(ArrayList<Integer> nums){
        for (int i = 0;i<nums.size()-1;i++){
            if (nums.get(i)>nums.get(i+1)){
                return i+1;
            }
        }
        return 0;
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
        System.out.println("Value : " + findKRotation(arr));
    }
}

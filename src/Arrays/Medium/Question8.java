package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question8 {
    public static void reverse(List<Integer> list){
        int n = list.size();
        for (int i = 0;i<n/2;i++){
            int temp = list.get(i);
            list.set(i,list.get(n-i-1));
            list.set(n-i-1,temp);
        }
    }
    public static List<Integer> leaders(int[] nums){
        List<Integer> list = new ArrayList<>();
        list.add(nums[nums.length-1]);
        int max = nums[nums.length-1];
        for (int i = nums.length-2;i>=0;i--){
            if (nums[i]>max){
                max = nums[i];
                list.add(max);
            }
        }
        reverse(list);
        return list;
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
        List<Integer> list = leaders(arr);
        System.out.println("List : ");
        for (int e : list){
            System.out.print(e + " ");
        }
    }
}

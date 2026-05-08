package Arrays.Hard;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Question2 {
    public static List<Integer> majorityElementTwo(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for (int e : map.keySet()){
            if (map.get(e)>nums.length/2){
                list.add(e);
            }
        }
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
        List<Integer> list = majorityElementTwo(arr);
        System.out.println("List : ");
        for (int e : list){
            System.out.print(e + " ");
        }
    }
}

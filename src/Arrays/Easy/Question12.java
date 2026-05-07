package Arrays.Easy;

import java.util.HashMap;
import java.util.Scanner;

public class Question12 {
    public static int singleNumber(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int e : arr){
            map.put(e, map.getOrDefault(e,0)+1);
        }
        for (int e : map.keySet()){
            if (map.get(e)==1){
                return e;
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
        System.out.println("Single Number : " + singleNumber(arr));
    }
}

package Arrays.Hard;

import java.util.HashMap;
import java.util.Scanner;

public class Question9 {
    public static int[] findMissingRepeatingNumbers(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[2];
        int sum = 0;
        for (int e : nums){
            map.put(e,map.getOrDefault(e,0) + 1);
            sum+=e;
        }
        int count = 0;
        int value = 0;
        for (int e : map.keySet()){
            if (map.get(e)!=1){
                value = e;
                count = map.get(e);
                break;
            }
        }
        arr[0] = value;
        int total = sum - value*(count-1);
        int som = (nums.length*(nums.length+1))/2;
        arr[1] = som-total;
        return arr;
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
        int[] mat = findMissingRepeatingNumbers(arr);
        System.out.println("Array : ");
        for (int e : mat){
            System.out.print(e + " ");
        }
    }
}

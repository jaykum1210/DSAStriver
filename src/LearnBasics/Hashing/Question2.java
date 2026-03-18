package LearnBasics.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Question2 {
    public static int fre(int[] arr){
        HashMap<Integer,Integer> hash = new HashMap<>();
        for (int e : arr){
            hash.put(e,hash.getOrDefault(e,0)+1);
        }
        int maxkey = 0;
        int max = 0;
        for (int e : hash.keySet()){
            if (max<hash.get(e)){
                maxkey = e;
                max = hash.get(e);
            }
        }
        return maxkey;
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
        int most = fre(arr);
        System.out.println("Most Frequent : " + most);
        return;
    }
}

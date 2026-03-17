package LearnBasics.Hashing;

import javax.swing.text.html.StyleSheet;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> hash = new HashMap<>();

        for(int i = 0;i<a;i++){
            hash.put(arr[i],hash.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> it : hash.entrySet()){
            System.out.println(it.getKey() + " -> " + it.getValue());
        }

        System.out.println("Enter How Many Characters Want to Check :");
        int q = sc.nextInt();
        System.out.println("Enter " + q + " Characters : ");
        for (int i = 0;i<q;i++){
            int num = sc.nextInt();
            System.out.println(hash.getOrDefault(num,0));
        }
    }
}

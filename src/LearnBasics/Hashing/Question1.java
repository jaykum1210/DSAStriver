package LearnBasics.Hashing;

import java.util.*;

public class Question1 {
    public static List<List<Integer>> fre(int[] arr){
        HashMap<Integer,Integer> hash = new HashMap<>();
        for (int e : arr){
            hash.put(e,hash.getOrDefault(e,0)+1);
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int e : hash.keySet()){
            List<Integer> li = new ArrayList<>();
            li.add(e);
            li.add(hash.get(e));
            result.add(li);
        }
        return result;
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
        List<List<Integer>> result = fre(arr);

        System.out.println(result);
    }
}

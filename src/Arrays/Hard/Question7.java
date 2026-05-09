package Arrays.Hard;

import java.util.*;

public class Question7 {
    public static List<List<Integer>> mergeOverlap(List<List<Integer>> intervals){
        Collections.sort(intervals, Comparator.comparingInt(a -> a.get(0)));
        List<List<Integer>> outer = new ArrayList<>();
        int m = intervals.size();
        for (int i = 0;i<m;i++){
            List<Integer> inner = new ArrayList<>();
            List<Integer> l1 = intervals.get(i);
            int min = l1.get(0);
            int max = l1.get(1);
            while(i < m - 1 && max >= intervals.get(i + 1).get(0)){
                max = Math.max(max,intervals.get(i + 1).get(1));
                i++;
            }
            inner.add(min);
            inner.add(max);
            outer.add(inner);
        }
        return outer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Outer Size : ");
        int a = sc.nextInt();
        System.out.println("Enter Inner Size : ");
        int b = sc.nextInt();
        List<List<Integer>> outer = new ArrayList<>();
        for (int i = 0;i<a;i++){
            List<Integer> inner = new ArrayList<>();
            for (int j = 0;j<b;j++){
                inner.add(sc.nextInt());
            }
            outer.add(inner);
        }
        List<List<Integer>> list = mergeOverlap(outer);
        System.out.println(list);
    }
}

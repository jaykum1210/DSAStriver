package Arrays.Hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 {
    public static int add(int r, int c){
        if (c==1 || c==r){
            return 1;
        }
        return add(r-1,c-1) + add(r-1,c);
    }
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> outer = new ArrayList<>();
        for (int i = 1;i<=numRows;i++){
            List<Integer> inner = new ArrayList<>();
            for (int j = 1;j<=i;j++){
                inner.add(add(i,j));
            }
            outer.add(inner);
        }
        return outer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row : ");
        int r = sc.nextInt();
        List<List<Integer>> list = generate(r);
        System.out.println(list);
    }
}

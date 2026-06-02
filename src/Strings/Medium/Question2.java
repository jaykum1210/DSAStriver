package Strings.Medium;

import java.util.Scanner;

public class Question2 {
    public static int maxDepth(String s){
        int depth = 0;
        int num = 0;
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)=='('){
                num++;
                if (num>depth) depth = num;
            } else if (s.charAt(i) == ')') {
                num--;
            }
        }
        return depth;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.nextLine();
        System.out.println("Max Depth : " + maxDepth(s));
    }
}

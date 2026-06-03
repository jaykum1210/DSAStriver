package Strings.Basic;

import java.util.Scanner;

public class Question5 {
    public static boolean isomorphicString(String s, String t){
        if (s.length()!=t.length()){
            return false;
        }
        int num = 1;
        for (int i = 0;i<s.length()-1;i++){
            if (!((s.charAt(i)==s.charAt(i+1) && t.charAt(i)==t.charAt(i+1)) || (s.charAt(i)!=s.charAt(i+1) && t.charAt(i) != t.charAt(i+1)))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String : ");
        String s1 = sc.nextLine();
        System.out.println("Enter Second String : ");
        String s2 = sc.nextLine();
        System.out.println("Isomorphic String? : " + isomorphicString(s1,s2));
    }
}

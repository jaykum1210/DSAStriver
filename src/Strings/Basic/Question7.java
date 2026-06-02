package Strings.Basic;

import java.util.HashMap;
import java.util.Scanner;

public class Question7 {
    public static boolean anagramStrings(String s, String t){
        if (s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for (int i = 0;i<s.length();i++){
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
        }
        return map1.equals(map2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String : ");
        String s1 = sc.nextLine();
        System.out.println("Enter Second String : ");
        String s2 = sc.nextLine();
        System.out.println("Reverse? : " + anagramStrings(s1,s2));
    }
}

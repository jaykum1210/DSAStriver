package Strings.Medium;

import java.util.HashMap;
import java.util.Scanner;

public class Question1 {
    public static String frequencySort(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        String str = "";
        while (!map.isEmpty()){
            int count = 0;
            char val =' ';
            for (Character key : map.keySet()){
                if (map.get(key)>=count){
                    count = map.get(key);
                    val = key;
                }
            }
            for (int i = 0; i < count; i++) {
                str+=val;
            }
            map.remove(val);
        }
        return str;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.nextLine();
        System.out.println("String : " + frequencySort(s));
    }
}

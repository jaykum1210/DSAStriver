package Strings.Basic;

import java.util.Scanner;

public class Question4 {
    public static String longestCommonPrefix(String[] strs) {
        String max = "";
        for (int i = 0; i < strs[0].length(); i++) {
            char x = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length()) {
                    return max;
                }
                if (strs[j].charAt(i) != x) {
                    return max;
                }
            }
            max += x;
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int len = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[len];
        for (int i = 0;i<len;i++){
            System.out.println("Enter String : ");
            arr[i] = sc.nextLine();
        }
        System.out.println("Longest Common Prefix : " + longestCommonPrefix(arr));
    }
}

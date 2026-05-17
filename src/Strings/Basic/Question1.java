package Strings.Basic;

import java.util.Scanner;

public class Question1 {
    public static String removeOuterParentheses(String s) {
        int len = s.length();
        int open = 0;
        int x = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < len; i++) {
            char c = arr[i];
            if (c == '(') {
                if (open > 0) {
                    arr[x++] = c;
                }
                open++;
            } else {
                open--;
                if (open > 0) {
                    arr[x++] = c;
                }
            }
        }
        return new String(arr, 0, x);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        System.out.println("String : " + removeOuterParentheses(str));
    }
}

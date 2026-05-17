package Strings.Basic;

import java.util.Scanner;

public class Question2 {
    public static String reverseWords(String s) {
        char[] arr = s.trim().replaceAll("\\s+", " ").toCharArray();
        int len = arr.length;
        for (int i = 0; i < len / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = temp;
        }
        int start = 0;
        for (int i = 0; i <= len; i++) {
            if (i == len || arr[i] == ' ') {
                int end = i - 1;
                while (start < end) {
                    char temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
                }

                start = i + 1;
            }
        }
        return new String(arr);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        System.out.println("String : " + reverseWords(str));
    }
}

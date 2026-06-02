package Strings.Medium;

import java.util.Scanner;

public class Question3 {
    public static int value(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        return 1000;
    }
    public static int romanToInt(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 &&
                    value(s.charAt(i)) < value(s.charAt(i + 1))) {
                num += value(s.charAt(i + 1)) - value(s.charAt(i));
                i++; // skip next character
            } else {
                num += value(s.charAt(i));
            }
        }
        return num;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.nextLine();
        System.out.println("Number : " + romanToInt(s));
    }
}

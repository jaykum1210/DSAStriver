package Strings.Medium;

import javax.swing.*;
import java.util.Iterator;
import java.util.Scanner;

public class Question4 {
    public static int myAtoi(String s){
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }
        boolean neg = false;
        int index = 0;
        if (s.charAt(0) == '-') {
            neg = true;
            index++;
        } else if (s.charAt(0) == '+') {
            index++;
        }
        long num = 0;
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            num = num * 10 + (s.charAt(index) - '0');
            if (!neg && num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (neg && -num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            index++;
        }
        return neg ? (int)-num : (int)num;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String a = sc.nextLine();
        System.out.println("Number : " + myAtoi(a));
    }
}

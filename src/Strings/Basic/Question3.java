package Strings.Basic;

import java.util.Scanner;

public class Question3 {
    public static String largeOddNum(String s){
        int i = s.length() - 1;
        while (i >= 0) {
            int digit = s.charAt(i) - '0';
            if (digit % 2 != 0) {
                return s.substring(0, i + 1);
            }
            i--;
        }
        return "";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.nextLine();
        System.out.println("Largest Odd Number : " + largeOddNum(s));
    }
}

package Strings.Basic;

import java.util.Scanner;

public class Question6 {
    public static boolean rotateString(String s, String goal){
        return s.length() == goal.length() && (s + s).contains(goal);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String : ");
        String s1 = sc.nextLine();
        System.out.println("Enter Second String : ");
        String s2 = sc.nextLine();
        System.out.println("Reverse? : " + rotateString(s1,s2));
    }
}

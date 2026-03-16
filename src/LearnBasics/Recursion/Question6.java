package LearnBasics.Recursion;

import java.util.Scanner;

public class Question6 {
    public static boolean palin(String a){
        int len = a.length();
        for (int i = 0;i<len;i++){
            char x = a.charAt(i);
            char y = a.charAt(len-i-1);
            if (x!=y){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String a = sc.nextLine();
        System.out.println(palin(a));
    }
}

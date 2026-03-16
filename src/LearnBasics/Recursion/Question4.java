package LearnBasics.Recursion;

import java.util.Scanner;

public class Question4 {
    public static int fact(int a){
        if (a==1 || a==0){
            return 1;
        }
        return a*fact(a-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        System.out.println(fact(a));
    }
}

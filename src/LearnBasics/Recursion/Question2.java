package LearnBasics.Recursion;

import java.util.Scanner;

public class Question2 {
    public static void printNum1(int n){
        if (n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printNum1(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        printNum1(a);
    }
}

package LearnBasics.Recursion;

import java.util.Scanner;

public class Question7 {
    public static int fib(int a){
        if(a == 0){
            return 0;
        } else if (a==1) {
            return 1;
        }
        return fib(a-1) + fib(a-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        System.out.println(fib(a));
    }
}

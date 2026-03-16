package LearnBasics.Recursion;

import java.util.Scanner;

public class Question1 {
    public static void printNum(int a){
        if(a == 1){
            System.out.println(1);
            return;
        }
        printNum(a-1);
        System.out.println(a);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        printNum(a);
    }
}

package LearnBasics.BasicMaths;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int ori = 0;
        while (a>0){
            int b = a%10;
            ori = ori*10+b;
            a/=10;
        }
        System.out.println("Reverse a Number : " + ori);
    }
}

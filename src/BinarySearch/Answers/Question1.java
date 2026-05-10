package BinarySearch.Answers;

import java.util.Scanner;

public class Question1 {
    public static int NthRoot(int N, int M){
        double x = Math.pow(M,(1.0/N));
        if (x == (int)x){
            return (int)x;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        System.out.println("Enter Nth Number : ");
        int n = sc.nextInt();
        System.out.println("Number : " + NthRoot(num,n));
    }
}

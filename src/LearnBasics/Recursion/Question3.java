package LearnBasics.Recursion;

import java.util.Scanner;

public class Question3 {
    public static int numsum(int a){
        if (a == 1){
            return 1;
        }
        return a + numsum(a-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        System.out.println(numsum(a));
    }
}

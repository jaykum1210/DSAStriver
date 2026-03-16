package LearnBasics.BasicMaths;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int rev = 0;
        int ori = a;
        while (a>0){
            int b = a%10;
            rev = rev*10 + b;
            a/=10;
        }
        System.out.println(rev==ori);
    }
}

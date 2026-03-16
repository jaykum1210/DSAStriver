package LearnBasics.BasicMaths;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int sum = 0;
        int ori = a;
        while (a>0){
            int b = a%10;
            sum+=(b*b*b);
            a/=10;
        }
        System.out.println(ori==sum);
    }
}

package LearnBasics.BasicMaths;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        for (int i = 2;i<=a/2;i++){
            if (a%i==0){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}

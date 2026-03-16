package LearnBasics.BasicMaths;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int ori = a;
        int count = 0;
        while (a>0){
            count++;
            a/=10;
        }
        System.out.println("There are " + count + " digits in " + ori + ".");
    }
}

package LearnBasics.Builduplogical;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        for (int i = 0; i < 2*a;i++){
            if (i<a){
                for (int j = 0;j<a-i-1;j++){
                    System.out.print("  ");
                }
                for (int j = 0;j<(2*i+1);j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else {
                for (int j = 0;j<i-a;j++){
                    System.out.print("  ");
                }
                for (int j = 0;j<(2*(2*a-i)-1);j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}

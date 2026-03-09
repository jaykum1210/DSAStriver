package LearnBasics.Builduplogical;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        for(int i = 0;i<a;i++){
            for(int j = 0;j<a-i-1;j++){
                System.out.print("  ");
            }
            for (int j = 0;j<(2*i+1);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

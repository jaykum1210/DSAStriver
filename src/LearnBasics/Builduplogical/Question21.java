package LearnBasics.Builduplogical;

import java.util.Scanner;

public class Question21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        for (int i = 0;i<a;i++){
            for (int j = 0;j<a;j++){
                if (j == 0 || j == a-1 || i == 0 || i == a-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

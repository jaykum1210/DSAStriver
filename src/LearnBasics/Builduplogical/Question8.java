package LearnBasics.Builduplogical;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        for(int i = 0;i<a;i++){
            for(int j = 0;j<i;j++){
                System.out.print("  ");
            }
            for(int j = 0;j<(2*(a-i)-1);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

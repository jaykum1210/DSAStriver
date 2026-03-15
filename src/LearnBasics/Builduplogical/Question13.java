package LearnBasics.Builduplogical;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        int num=1;
        for (int i = 0;i<a;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}

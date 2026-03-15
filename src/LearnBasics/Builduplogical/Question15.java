package LearnBasics.Builduplogical;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        for (int i = a;i>0;i--){
            char z = 'A';
            for (int j = 0;j<i;j++){
                System.out.print(z++ + " ");
            }
            System.out.println();
        }
    }
}

package LearnBasics.Builduplogical;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        for(int i = 0;i<a;i++){
            char z = 'A';
            for (int j = 0;j<=i;j++){
                System.out.print(z++ + " ");
            }
            System.out.println();
        }
    }
}

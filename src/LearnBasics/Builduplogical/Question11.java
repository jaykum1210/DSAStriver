package LearnBasics.Builduplogical;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        for (int i = 0;i<a;i++){
            for (int j = 0;j<=i;j++){
                if ((i%2==0 && j%2==0) || (i%2!=0 && j%2!=0)){
                    System.out.print(1);
                }
                else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}

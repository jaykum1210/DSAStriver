package LearnBasics.Builduplogical;

import java.util.Scanner;

public class Question19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        for (int i = 0;i<2*a;i++){
            if (i<a){
                for (int j = 0;j<2*a;j++){
                    if (j>a-i-1 && j<a+i){
                        System.out.print("  ");
                    }
                    else{
                        System.out.print("* ");
                    }
                }
            }
            else{
                for (int j = 0;j<2*a;j++){
                    if (j>i-a && j<3*a-i-1){
                        System.out.print("  ");
                    }
                    else {
                        System.out.print("* ");
                    }
                }
            }
            System.out.println();
        }
    }
}

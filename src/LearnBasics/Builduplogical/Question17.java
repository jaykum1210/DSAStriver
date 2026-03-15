package LearnBasics.Builduplogical;

import java.util.Scanner;

public class Question17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        for(int i = 0;i<a;i++){
            char z = 'A';
            for (int j = 0;j<a-i-1;j++){
                System.out.print("  ");
            }
            for (int j = 0;j<(2*i+1);j++){
                if (j<((2*i+1)/2)){
                    System.out.print(z++ + " ");
                }
                else{
                    System.out.print(z-- + " ");
                }
            }
            System.out.println();
        }
    }
}

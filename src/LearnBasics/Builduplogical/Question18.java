package LearnBasics.Builduplogical;

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        for(int i = 0;i<a;i++){
            for (int j = a-i;j<=a;j++){
                System.out.print((char)('A' + j-1) + " ");
            }
            System.out.println();
        }
    }
}

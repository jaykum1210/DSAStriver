package LearnBasics.Builduplogical;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        for(int i = 0;i<a;i++){
            for(int j=1;j<=a-i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

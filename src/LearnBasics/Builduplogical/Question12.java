package LearnBasics.Builduplogical;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        for (int i = 0;i<a;i++){
            for (int j = 0;j<2*a;j++){
                if (j<a){
                    for (int k = 0;k<=i;k++,j++){
                        System.out.print(j+1 + " ");
                    }
                    for (int k = 0;k<a-i-1;k++,j++){
                        System.out.print("  ");
                    }
                }
                else{
                    for (int k = 0;k<a-i-1;k++,j++){
                        System.out.print("  ");
                    }
                    for (int k = 0;k<=i;k++,j++){
                        System.out.print(2*a-j+1+" ");
                    }
                }
            }
            System.out.println();
        }
    }
}

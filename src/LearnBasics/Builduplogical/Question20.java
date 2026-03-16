package LearnBasics.Builduplogical;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Question20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        for(int i = 0;i<2*a-1;i++){
            if (i<a){
                for (int j = 0;j<2*a-1;j++){
                    if (j>i && j<2*a-i-2){
                        System.out.print("  ");
                    }
                    else{
                        System.out.print("* ");
                    }
                }
            }
            else{
                for(int j = 0;j<2*a-1;j++){
                    if(j>2*a-i-2 && j<i){
                        System.out.print("  ");
                    }
                    else{
                        System.out.print("* ");
                    }
                }
            }
            System.out.println();
        }
    }
}

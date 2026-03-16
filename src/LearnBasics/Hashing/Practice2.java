package LearnBasics.Hashing;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int[] hash = new int[256];
        for (int i = 0;i<a.length();i++){
            hash[a.charAt(i)]+=1;
        }
        System.out.println("Enter How Many Characters Want to Check :");
        int q = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter " + q + " Characters : ");
        for (int i = 0;i<q;i++){
            char c = sc.nextLine().charAt(0);
            System.out.println(hash[(int)c]);
        }
    }
}

package LearnBasics.Hashing;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for(int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }

        int[] hash = new int[100];

        for (int i = 0;i<a;i++){
            hash[arr[i]]+=1;
        }

        System.out.println("Enter How Many Numbers Want to Check :");
        int q = sc.nextInt();

        System.out.println("Enter " + q + " Numbers : ");
        for (int i = 0;i<q;i++){
            int num = sc.nextInt();
            System.out.println(hash[num]);
        }

    }
}

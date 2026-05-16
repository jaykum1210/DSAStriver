package BinarySearch.Answers;

import java.util.Scanner;

public class Question14 {
    public static int kthElement(int[] a, int[] b, int k){
        int m = a.length;
        int n = b.length;
        int x = 0;
        int y = 0;
        int last = 0;
        for (;k!=0;k--){
            if(a[x]<b[y]){
                last = a[x];
                x++;
            }
            else{
                last = b[y];
                y++;
            }
        }
        return last;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        System.out.println("Enter Size : ");
        int[] arr1 = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter Size : ");
        int b = sc.nextInt();
        int[] arr2 = new int[b];
        System.out.println("Enter " + b + " Elements : ");
        for (int i = 0;i<b;i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println("Enter Position : ");
        int k = sc.nextInt();
        System.out.println("Number : " + kthElement(arr1,arr2,k));
    }
}

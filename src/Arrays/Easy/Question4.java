package Arrays.Easy;

import java.util.Scanner;

public class Question4 {
    public static int countunique(int[] arr){
        int[] ori = arr.clone();
        int count = 0;
        for(int i = 0;i<ori.length;i++){
            boolean x = true;
            for(int j = i-1;j>=0;j--){
                if(arr[i]==ori[j]){
                    x = false;
                    break;
                }
            }
            if(x){
                arr[count++] = ori[i];
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int num = countunique(arr);
        System.out.println("Unique Numbers : " + num);
        System.out.println("Array : ");
        for (int i = 0;i<num;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

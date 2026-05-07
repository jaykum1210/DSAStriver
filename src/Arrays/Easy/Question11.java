package Arrays.Easy;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Question11 {
    public static int findMaxConsecutiveOnes(int[] arr){
        int max = 0;
        int count = 0;
        for (int i = 0;i<arr.length;i++){
            if (arr[i]== 1){
                count++;
                if (count>max) max = count;
            }
            else{
                count = 0;
            }
        }
        return max;
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
        System.out.println("Consecutive 1 : " + findMaxConsecutiveOnes(arr));
    }
}

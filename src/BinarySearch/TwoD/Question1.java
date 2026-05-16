package BinarySearch.TwoD;

import java.util.Scanner;

public class Question1 {
    public static int rowWithMax1s(int[][] mat){
        int max = 0;
        int maxindex = -1;
        for (int i = 0;i<mat.length;i++){
            int count = 0;
            for (int j = 0;j<mat[0].length;j++){
                if (mat[i][j]==1){
                    count++;
                }
            }
            if (count>max){
                max = count;
                maxindex = i;
            }
        }
        return maxindex;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row : ");
        int m = sc.nextInt();
        System.out.println("Enter Column : ");
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                System.out.println("Enter element at row " + (i+1) + " and column " + (j+1) + " : ");
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Row : " + rowWithMax1s(mat));
    }
}

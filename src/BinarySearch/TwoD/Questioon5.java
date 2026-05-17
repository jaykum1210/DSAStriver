package BinarySearch.TwoD;

import java.util.Scanner;

public class Questioon5 {
    public static int findMedian(int[][] matrix){
        int m = matrix.length/2;
        int n = matrix[0].length/2;
        if ((m*n)%2!=0){
            return matrix[m][n];
        }
        int sum = matrix[m-1][n] + matrix[m][n-1];
        return sum/2;
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
        System.out.println("Median : " + findMedian(mat));
    }
}

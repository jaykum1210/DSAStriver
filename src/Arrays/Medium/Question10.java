package Arrays.Medium;

import java.util.Scanner;

public class Question10 {
    public static void setZeroes(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] column = new boolean[n];
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                if (matrix[i][j] == 0){
                    row[i] = true;
                    column[j] = true;
                }
            }
        }
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                if (row[i]|| column[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rwo and Column : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                System.out.print("Enter Element at row " + (i+1) + " and Column " + (j+1) + " : ");
                mat[i][j] = sc.nextInt();
            }
        }
        setZeroes(mat);
        System.out.println("Matrix : ");
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

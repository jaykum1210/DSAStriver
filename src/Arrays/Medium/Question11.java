package Arrays.Medium;

import java.util.Scanner;

public class Question11 {
    public static void rotateMatrix(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 1;i<m;i++){
            for (int j = 0;j<i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
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
        rotateMatrix(mat);
        System.out.println("Matrix : ");
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

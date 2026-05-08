package Arrays.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question12 {
    public static List<Integer> spiralOrder(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;
        List<Integer> list = new ArrayList<>();
        while (top<=bottom && left<=right){
            for (int i = left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            for(int i = top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left<=right){
                for (int i = bottom;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
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
        List<Integer> list = spiralOrder(mat);
        System.out.print("Matrix : ");
        for (int e : list){
            System.out.print(e + " ");
        }
    }
}

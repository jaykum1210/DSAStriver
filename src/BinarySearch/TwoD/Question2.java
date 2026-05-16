package BinarySearch.TwoD;

import java.util.Scanner;

public class Question2 {
    public static boolean searchMatrix(int[][] mat,int target){
        int m = mat.length;
        int n = mat[0].length;
        int left = 0;
        int right = (m*n)-1;
        while (left<=right){
            int mid = left + (right-left)/2;
            int row = mid/n;
            int col = mid%n;
            if (mat[row][col] == target) {
                return true;
            } else if (target < mat[row][col]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
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
        System.out.println("Enter Element : ");
        int target = sc.nextInt();
        System.out.println("found? : " + searchMatrix(mat,target));
    }
}

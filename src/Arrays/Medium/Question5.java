package Arrays.Medium;

import java.util.Scanner;

public class Question5 {
    public static int stockBuySell(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            int currentProfit = prices[i] - min;
            if(currentProfit > profit){
                profit = currentProfit;
            }
        }
        return profit;
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
        System.out.println("Profit : " + stockBuySell(arr));
    }
}

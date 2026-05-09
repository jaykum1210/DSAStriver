package Arrays.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Question4 {
    public static List<List<Integer>> fourSum(int[] nums, int target){
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> outer = new ArrayList<>();
        for(int i = 0; i < n - 3; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            for(int j = i + 1; j < n - 2; j++){
                if(j > i + 1 && nums[j] == nums[j - 1]){
                    continue;
                }
                int left = j + 1;
                int right = n - 1;
                while(left < right){
                    long sum = (long) nums[i]+ nums[j]+ nums[left]+ nums[right];
                    if(sum == target){
                        List<Integer> inner = new ArrayList<>();
                        inner.add(nums[i]);
                        inner.add(nums[j]);
                        inner.add(nums[left]);
                        inner.add(nums[right]);
                        outer.add(inner);
                        left++;
                        right--;
                        while(left < right &&
                                nums[left] == nums[left - 1]){
                            left++;
                        }
                        while(left < right &&
                                nums[right] == nums[right + 1]){
                            right--;
                        }
                    }
                    else if(sum < target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        return outer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for(int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target : ");
        int target = sc.nextInt();
        List<List<Integer>> list = fourSum(arr,target);
        System.out.println(list);
    }
}

import java.util.Arrays;

public class Answers {    
   public static void main(String[] args) {

    //Inputs
    int[] nums = {2,7,11,15};
    int target = 9;


    //Funtion 
    System.out.println(Arrays.toString(twoSum(nums, target)));

    }


    /* Q3. https://leetcode.com/problems/two-sum/  
            Solution brut force Time O(n^2) Space O(1) */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return new int[]{};
    }
    
}


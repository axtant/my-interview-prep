

public class Answers {    
   public static void main(String[] args) {

    //Inputs
    int[] nums = {3,0,1};


    //Funtion 
    System.out.println(missingNumber(nums));

    }

    /*Q.1 https://leetcode.com/problems/missing-number 
            Brut force 
            Time O(n^2)
            Space O(1) */
    public static int missingNumber(int[] nums){
       for (int i = 0; i < nums.length; i++) {
            boolean found = false;
             for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i){
                    found = true;
                    break;
                }
             }
             if(!found) return i;   
       }
        return 1;
    }


    /* Q3. https://leetcode.com/problems/two-sum/  
            Solution brut force
            Time O(n^2)
            Space O(1) */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return new int[]{};
    }
    
}


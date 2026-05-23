

public class Answers {    
   public static void main(String[] args) {

    //Inputs
    int[] nums = {0,1,0,3,12};


    //Funtion 
    moveZeroes(nums);

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

    /*Q.2 https://leetcode.com/problems/remove-duplicates-from-sorted-array
                Brut Force
                Time O(n^2)
                Space   */
    public static int removeDuplicates(int[] nums){
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }


    /*Q3. https://leetcode.com/problems/two-sum/  
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

    /*Q4. https://leetcode.com/problems/move-zeroes/description/
            Solution Brut force
            Time O(n^2)
            Space O(1)*/ 
    public static void moveZeroes(int[] nums) {
    int l = 0;
    int r = 0;
        for (int i = 0; i < nums.length ; i++) {
            while(nums[r] != 0){
                int move = nums[r];
                nums[r] = nums[l];
                nums[l] = move;
                l++;
            }
            r++;
        }   
    }

}


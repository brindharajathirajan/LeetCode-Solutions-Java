// Problem link - https://leetcode.com/problems/maximum-subarray/

class Solution {  // KADANE'S ALGORITHM
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int curSum = nums[0];

        for(int i=1;i<nums.length;i++){
            if(curSum < 0) curSum = nums[i];
            else curSum += nums[i];

            maxSum = Math.max(maxSum,curSum);
        }
        return maxSum;
        
    }
    
}

/* class Solution {
    public int maxSubArray(int[] nums){
        int sum = 0;
        int max_sum = nums[0];
        for(int i = 0;i<nums.length;i++){
            sum = sum + nums[i];
            if(sum > max_sum){
                max_sum = sum;
            }
            if(sum < 0){
                sum = 0;
            }

        }
        return max_sum;
    }
}


/*Order of elements cannot be changed in a subarray
  Order of elements can be changed in a subsequence */



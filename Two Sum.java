class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] res = new int[2];
       for(int i = 0 ;i<nums.length-1;i++){
           for(int j = i + 1;j<nums.length;j++){
               if(nums[i] + nums[j] == target){
                   res[0] = i;
                   res[1] = j;
               }
           }
       }
       return res;
        
    }
}


//This is another approach.
/*    int[] res  = new int[2];
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(mp.containsKey(target -nums[i])){
                res[1] = i;
                res[0] = mp.get(target - nums[i]); 
            }
            else{
                mp.put(nums[i],i );
            }
        }
        return res;
*/

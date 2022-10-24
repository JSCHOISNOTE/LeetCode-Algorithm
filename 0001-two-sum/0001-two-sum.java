class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int n = 0; n <= nums.length-2; n++){
            for(int m = 1; m<=nums.length-1; m++){
                if(nums[n]+nums[m] == target && n!=m){
                    return new int[] {n,m};
                }
            }
        }
        return null;
    }
    
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i<nums.length; i++){
            for(int k = i+1; k<nums.length; k++){
            if(nums[i]+nums[k]==target){
                return new int[]{i,k};
                
            }
        }
    }
        throw new IllegalArgumentException("No two sum solution");
}
}
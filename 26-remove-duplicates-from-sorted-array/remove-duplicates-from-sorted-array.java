class Solution {
    public int removeDuplicates(int[] nums) {
        int idx = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[idx] == nums[i]){
                continue;
            }else{
                idx++;
                nums[idx] = nums[i];
            }
        }
        return idx+1;
    }
}
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int s2= n* (n+1)/2;
        int s1 =0;
         for( int i=0; i<nums.length;i++) {
            s1+= nums[i];
              

         }
         return s2-s1;
    }
}
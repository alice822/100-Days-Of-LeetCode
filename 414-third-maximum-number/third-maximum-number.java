class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> top3 = new TreeSet<>();

        for( int i =0; i<nums.length;i++){
            top3.add(nums[i]);

            if(top3.size()>3){
                 top3.pollFirst(); 


            }
        }
         return (top3.size() == 3) ? top3.first() : top3.last();

    }
}
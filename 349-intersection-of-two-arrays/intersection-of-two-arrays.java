class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        HashSet<Integer>resultset = new HashSet<>();
        int i = 0;
        int j = 0;
        while(i< nums1.length && j< nums2.length ){
            if( nums1[i]< nums2[j]){
                i++;
            }else if( nums1[i]> nums2[j]){
                j++;
            }else {
                resultset.add(nums1[i]);
               i++;
               j++; 

            }

        }
        //converting hashset to array
        int[]  result = new int[resultset.size()];
        int k =0;
         for (int num : resultset) {
            result[k++] = num;
        }
        
        return result;
    }
}
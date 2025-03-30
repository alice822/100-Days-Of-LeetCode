class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        // Min heap to store k largest elements
        PriorityQueue<String> minHeap = new PriorityQueue<>(
            (a, b) -> {
                if (a.length() == b.length()) {
                    return a.compareTo(b); // Lexicographical comparison if lengths are same
                }
                return Integer.compare(a.length(), b.length()); // Compare based on length
            }
        );

        // Process each number in nums
        for (String num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove smallest element
            }
        }

        return minHeap.peek(); // The root of the heap is the kth largest element
    }
}
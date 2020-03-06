class Solution {
    
    //idea is to create a hashmap to put integers that are seen and map their frequencies
    //we can short circuit the iteration by checking if the frequency of the number ever gets larger than n/2 (for the majority element)
    //O(n) time complexity because we have to iterate over the array of size n
    //O(n) space complexity because we have to create a hashmap of n elements
    
    public int mjorityElement(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        int majorityElement = 0;
        for (int i = 0; i < nums.length; i++) {
            if  (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], 1);
            }
            if (hm.get(nums[i]) > nums.length/2) {
                return nums[i];
            }
        }
        throw new IllegalArgumentException();
    }
}

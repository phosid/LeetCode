class Solution {
    
    //idea is to create a hashmap to put integers that are seen and map their frequencies
    //we can short circuit the iteration by checking if the frequency of the number ever gets larger than n/2 (for the majority element)
    //O(n) time complexity because we have to iterate over the array of size n
    //O(n) space complexity because we have to create a hashmap of n elements
    
    public int majorityElement(int[] nums) {
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
    
    
    //we can also use the Boyer-Moore voting algorithm-- idea is to track the first element in the array as the majority candidate
    //each time we see the candidate, we add to the count, and subtract if it's a different number from the candidate.
    //if the count reaches 0, we switch over to a new candidate at that starting point where the count reaches 0.
    //O(n) time complexity because we have to iterate over the n elements in the array
    //O(1) space complexity, no new array or hashmap is needed to house the elements
    
    public int majorityElementUsingBoyerMoore(int[] nums) {
        int count = 1;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[index] == nums[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                index = i;
                count = 1;
            }
        }
        return nums[index];
    }
      
}

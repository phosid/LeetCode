class Solution {
    
    //idea is to create a hashmap, and add in elements that has been iterated over with key: num, value: index
    //constant time lookups O(1)
    //recalculate the complement every time to see if the complement matches an element that is in hashmap
    //O(n) time complexity because we have to iterate through the entire array
    //O(n) space complexity because we create a hashmap to store n elements
    
    public int[] twoSum(int[] nums, int target) {     
        
        //create hashmap of Integer keys (numbers) and Integer values (index)
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        //iterate through int array nums
        for (int i = 0; i < nums.length; i++) {
            //find target complement for each value iterated
            int complement = target - nums[i];
            if (hm.containsKey(complement)) {
                //get method retrieves the value associated with the complement i.e. the index
                return new int[]{hm.get(complement), i};
            } else {
                //if complement is not found, add into hashmap and continue iterating
                hm.put(nums[i], i);
            }
        }
        //if no values add up to the target is seen in the integer array, throw an exception
        throw new IllegalArgumentException("No two values equal target!");
        
    }
}

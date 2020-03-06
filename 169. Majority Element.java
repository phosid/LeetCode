class Solution {
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
}

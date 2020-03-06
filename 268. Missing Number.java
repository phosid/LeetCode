class Solution {

    //idea is to take advantage of Gauss's summation laws which is n*(n+1)/2 (expected value for 0 + 1 + 2... + n).
    //after figuring out the expected sum, we can subtract that value from the real sum that we get by adding all the elements in the array
    //O(n) time complexity because we have to iterate over all the elements in the array
    //O(1) space complexity, no new data structure or array is formed


    public int missingNumber(int[] nums) {
        int expectedSum = nums.length * (nums.length + 1)/2;
        int actualSum = 0;
        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }
        return expectedSum - actualSum;
    }
}

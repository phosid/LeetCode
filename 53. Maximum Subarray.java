class Solution {

    //The solution is known as Kadane's algorithm. We iterate through the array and if the sum is less than the max_so_far
    //(which is initially set for the lowest value possible), we update the sum to be that max value. Now if the sum is less than 0, 
    //we set sum to be equal to 0 to begin the start of the new array. While this is happening, we keep track of the max_so_far.
    //O(n) time complexity, O(1) space complexity


    public int maxSubArray(int[] nums) {
        int max_so_far = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (max_so_far < sum) {
                max_so_far = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max_so_far;
    }
}

class Solution {

    //the idea is to reverse the entire array first, then reverse the first k elements, and then reverse the rest of the n-k elements
    //this creates a right rotate array of k indexes
    //O(n) time complexity because of the while loop
    //O(1) space complexity because we do it in place


    public void rotate(int[] nums, int k) {
        
        //this will determine how much we need to rotate on arrays of length that are smaller than k.
        k %= nums.length;
        
        //first reverse the entire array
        reverse(nums, 0, nums.length - 1);
        
        //then reverse the first k elements of the reversed array
        //k - 1 because it is 0 based index. so if k = 3, we want to reverse index 0, 1, and 2
        reverse(nums, 0, k - 1);
        
        //then reverse the last n - k elements of the array
        reverse(nums, k, nums.length - 1);
    }
    
    
    
    
    //in-place array reversing algorithm
    public void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

class Solution {
    // 부분배열을 더했을 때 가장 큰 값을 찾는다
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE, sum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            
            ans = Math.max(ans, sum);
            
            if (sum < 0) {
                sum = 0;
            }
        }
        
        return ans;
    }
}
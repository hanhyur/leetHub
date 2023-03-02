class Solution {
    // 증가하는 형태를 가진 가장 긴 부분수열의 길이를 구한다
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int[] dp = new int[nums.length];
        int ans = 1;
        
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1; // 케이스 중 가장 짧은 경우 1이기 때문
            
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    ans = Math.max(dp[i], ans);
                }
            }
        }
        
        return ans; 
    }
}
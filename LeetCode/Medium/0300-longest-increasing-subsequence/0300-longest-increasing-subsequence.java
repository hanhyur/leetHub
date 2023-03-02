class Solution {
    // 증가하는 형태를 가진 가장 긴 부분수열의 길이를 구한다
    public int lengthOfLIS(int[] nums) {
        int n = nums.length, ans = 0;
        int[] dp = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (ans == 0 || dp[ans - 1] < nums[i]) {
                dp[ans++] = nums[i]; 
            } else {
                var j = ans - 1;
                
                while(j >= 0 && dp[j] >= nums[i]) {
                    j--; 
                }
                
                dp[++j] = nums[i]; 
            } 
        }
        
        return ans;
    }
}
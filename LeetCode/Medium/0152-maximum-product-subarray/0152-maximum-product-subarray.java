class Solution {
    // 결과 값이 가장 큰 부분수열을 구한다.
    // 단, 연속되어야만 한다.
    public int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0], ans = nums[0];
        int n = nums.length;
        
        for (int i = 1; i < n; i++) {
            // max, min 서로 바꾸기
            if (nums[i] < 0){
                int temp = max;
                max = min;
                min = temp;
            }
            
            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);

            ans = Math.max(ans, max);
        }
        
        return ans;
    }
}
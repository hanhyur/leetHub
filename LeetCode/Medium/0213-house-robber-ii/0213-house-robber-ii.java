class Solution {
    // 순환배열이기 때문에 0번째 집과 마지막 집은 서로 이웃이다.
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        
        return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
    }
    
    private int rob(int[] num, int lo, int hi) {
        int include = 0, exclude = 0;
        
        for (int j = lo; j <= hi; j++) {
            int i = include, e = exclude;
            include = e + num[j];
            exclude = Math.max(e, i);
        }
        
        return Math.max(include, exclude);
    }
}
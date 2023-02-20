class Solution {
    // 결과 값이 가장 큰 부분수열을 구한다.
    public int maxProduct(int[] nums) {
        int ans =  Integer.MIN_VALUE;
        int prod = 1;

        for (int i = 0; i < nums.length; i++){
            prod *= nums[i];
            
            ans = Math.max(ans, prod);
            
            if (prod == 0) {
                prod = 1;
            }
        }
        
        prod = 1;
        
        for (int i = nums.length - 1; i >= 0; i--){
            prod *= nums[i];
            
            ans = Math.max(ans, prod);
            
            if (prod == 0) {
                prod = 1;
            }
        }
        
        return ans;
    }
}
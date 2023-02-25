class Solution {
    // n의 길이를 가진 배열이 주어질 때, 0부터 n까지의 숫자 중
    // 배열에 없는 숫자를 구한다. 단, 모든 숫자는 유니크 하다.
    public int missingNumber(int[] nums) {
        int ans = nums.length;
        
        // XOR을 사용
        for (int i = 0; i < nums.length; i++){
            ans ^= i;
            ans ^= nums[i];
        }
        
        return ans;
    }
}
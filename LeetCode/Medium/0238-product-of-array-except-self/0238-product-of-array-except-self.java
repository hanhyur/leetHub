class Solution {
    // 자신(현재 인덱스)을 제외한 나머지 요소들을 곱한 값을 요소로 가지는 배열을 구한다.
    // 1. 1차원적으로 값을 계산해서 배열을 만든다 -> 시간 초과
    // 2. 배열 전체를 곱한 값에서 현재 인덱스를 나눈 값 -> 0이 있을 경우 문제가 생김
    // 3. 앞에서부터 곱한 배열 pre과 뒤에서부터 곱한 배열 suf을 만든다. 그리고 pre와 suf의
    // 각 인덱스를 곱한 값으로 배열을 만든다 -> 공간 복잡도가 O(n)이다.
    // 4. 기존의 pre와 suf를 하나로 만든다.
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        
        Arrays.fill(ans, 1);
        
        int curr = 1;
        
        for (int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        
        curr = 1;
        
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        
        return ans;
    }
}
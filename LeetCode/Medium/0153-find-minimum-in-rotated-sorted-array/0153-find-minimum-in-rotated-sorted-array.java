class Solution {
    // 주어진 배열을 오름차순 정렬을 했을 때 가장 작은 값을 구한다.
    public int findMin(int[] nums) {
        // left, right는 인덱스
        int left = 0, right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // 모든 값은 유니크하기 때문에 같은 경우를 고려하지 않는다
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return nums[left];
    }
}
class Solution {
    // 주어진 배열에서 target을 구한다.
    // 모든 값은 유니크하기 때문에 중복은 고려하지 않는다
    public int search(int[] nums, int target) {
        // left, right는 인덱스
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (target == nums[mid]) {
                return mid;
            }
        
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        
        return -1;
    }
}
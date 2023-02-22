class Solution {
    // 저장할 수 있는 물의 최댓값을 구한다
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, answer = 0;
        
        while (left < right) {
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            
            int amount = w * h;
            
            answer = Math.max(answer, amount);
            
            if (height[left] < height[right]) {
                left++;
            } else if (height[left] > height[right]) {
                right--;
            } else {
                left++;
                right--;
            }
        }
        
        return answer;
    }
}
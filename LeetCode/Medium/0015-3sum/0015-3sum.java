class Solution {
    // 더해서 0이 되는 부분배열을 모두 구한다.
    public List<List<Integer>> threeSum(int[] nums) {
        int target = 0;
        
        Arrays.sort(nums);
        
        Set<List<Integer>> s = new HashSet<>();
        List<List<Integer>> answer = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++){
            int j = i + 1;
            int k = nums.length - 1;
        
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
            
                if (sum == target) {
                    s.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        
        answer.addAll(s);
        
        return answer;
    }
}
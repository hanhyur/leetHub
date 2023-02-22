import java.util.AbstractList;

class Solution {
    private List<List<Integer>> ans;
    
    // 더해서 0이 되는 부분배열을 모두 구한다.
    public List<List<Integer>> threeSum(int[] nums) {
        return new AbstractList<List<Integer>>() {
            
            public List<Integer> get(int index) {
                init();
                
                return ans.get(index);
            }
            
            public int size() {
                init();
                
                return ans.size();
            }
            
            private void init() {
                if (ans != null)  {
                    return;
                }
                
                Arrays.sort(nums);
                
                int left, right;
                int sum;
                Set<List<Integer>> temp = new HashSet<>();
                
                for (int i = 0; i < nums.length - 2; i++) {
                    left = i + 1;
                    right = nums.length - 1;
                    
                    while (left < right) {
                        sum = nums[i] + nums[left] + nums[right];
                        
                        if (sum == 0) {
                            temp.add(Arrays.asList(nums[i], nums[left], nums[right]));
                            
                            left++; 
                            right--;
                        } else if (sum < 0) {
                            left++;
                        } else {
                            right--;
                        }
                    }
                }
                
                ans = new ArrayList<List<Integer>>(temp);
            }
        };
    }
}
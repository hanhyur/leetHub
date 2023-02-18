class Solution {
    // 중복이 한 번이라도 존재하면 true, 없으면 false를 출력한다
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>(nums.length);

        for(int num : nums){
            if (!set.add(num)) {
                return true;
            }
        }

        return  false;
    }
}
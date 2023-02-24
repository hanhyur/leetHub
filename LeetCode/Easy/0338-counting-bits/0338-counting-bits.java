class Solution {
    // 0부터 n까지의 수를 이진수로 변환했을 때 각각의 1의 갯수를 구한다
    public int[] countBits(int n) {
        int[] answer = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            answer[i] = answer[i >> 1] + (i & 1);
        }
        
        return answer;
    }
}
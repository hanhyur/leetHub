class Solution {
    // 0부터 n까지의 수를 이진수로 변환했을 때 각각의 1의 갯수를 구한다
    public int[] countBits(int n) {
        int[] answer = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            // 짝수이면 항상 그 값의 반을 1만큼 << 한 것과 같다
            // 홀수이면 값보다 1 작은 값에 1을 더하면 된다
            if (i % 2 == 0) {
                answer[i] = answer[i / 2];
            } else {
                answer[i] = answer[i - 1] + 1;
            }
        }
        
        return answer;
    }
}
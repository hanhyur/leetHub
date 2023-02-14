class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        
        // 투 포인터 활용. 뒤에서부터 탐색
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        
        while (i >= 0 || j >= 0) {
            // 이전 계산에서 넘어오는 수를 더해줌
            int sum = carry;
            
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            
            sb.append(sum % 2);
            carry = sum / 2; // 넘어가는 수 담기
            
        }
        
        if (carry != 0) {
            sb.append(carry);
        }
        
        return sb.reverse().toString(); // 뒤집어서 출력
    }
}
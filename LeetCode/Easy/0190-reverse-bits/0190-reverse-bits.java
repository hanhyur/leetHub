public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = n;
        
        // 주어진 2진수를 반으로 쪼개서 자리를 바꾸는 방식
        // 32비트에서 16비트씩으로 쪼개서 자리 교체
        ans = ((ans & 0xffff0000) >>> 16) | ((ans & 0x0000ffff) << 16);
        // 16비트에서 8비트씩으로 쪼개서 자리 교체
        ans = ((ans & 0xff00ff00) >>> 8) | ((ans & 0x00ff00ff) << 8);
        // 8비트에서 4비트 씩으로 쪼개서 자리 교체
        ans = ((ans & 0xf0f0f0f0) >>> 4) | ((ans & 0x0f0f0f0f) << 4);
        // 4비트에서 2비트 씩으로 쪼개서 자리 교체
        ans = ((ans & 0xcccccccc) >>> 2) | ((ans & 0x33333333) << 2);
        // 2비트에서 1비트 씩으로 쪼개서 자리 교체
        ans = ((ans & 0xaaaaaaaa) >>> 1) | ((ans & 0x55555555) << 1);
        
        return ans;
    }
}
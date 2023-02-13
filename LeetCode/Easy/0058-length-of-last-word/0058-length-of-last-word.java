class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        int i = str.length - 1;

        return str[i].length();
    }
}
class Solution {
    public int lengthOfLastWord(String s) {
        char[] ch = s.toCharArray();
        int len = 0;
        int res = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ') {
                len++;
            } else if (ch[i] == ' ' && len > 0) {
                res = len;
                len = 0;
            }
        }
        return len > 0 ? len : res;
    }
}

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        
        char[] a = haystack.toCharArray();
        char[] b = needle.toCharArray();
        int k = 0;
        int u = 0;
        int res = -1;

        while (k < a.length) {
            char ch1 = haystack.charAt(k);
            char ch2 = needle.charAt(u);
            
            if (ch1 == ch2 && res == -1) {
                res = k;  
                k++;
                u++;
            } else if (ch1 == ch2) {
                k++;
                u++;
            } else {
                if (res != -1) {
                    k = res + 1; 
                } else {
                    k++;
                }
                res = -1;  
                u = 0;     
            }

            if (u == b.length) {
                return res;
            }
        }

        return -1;
    }
}

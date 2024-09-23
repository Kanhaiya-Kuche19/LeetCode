class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
        return "";
    }

    int minLen = strs[0].length();
    for (int i = 1; i < strs.length; i++) {
        if (minLen > strs[i].length()) {
            minLen = strs[i].length();
        }
    }

    String[] arr = new String[strs.length];
    for (int j = 0; j < strs.length; j++) {
        arr[j] = strs[j].substring(0, minLen);
    }

    String res = "";
    int cnt = 0;

    while (cnt < minLen) {
        boolean flag = true;
        char ch1 = arr[0].charAt(cnt);
        for (int u = 1; u < arr.length; u++) {
            if (arr[u].length() == 0 || arr[u].charAt(cnt) != ch1) {
                flag = false;
                break;
            }
        }
        if (flag) {
            res += ch1;
            cnt++;
        } else {
            break;
        }
    }

    return res;
    }
}
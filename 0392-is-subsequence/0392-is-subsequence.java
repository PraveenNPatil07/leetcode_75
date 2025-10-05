class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length(), j = 0;
        if(s.equals("")) return true;
        for(char ch : t.toCharArray()){
            if(ch == s.charAt(j)) j++;
            if(j == n) return true;
        }
        return j == n;
    }
}
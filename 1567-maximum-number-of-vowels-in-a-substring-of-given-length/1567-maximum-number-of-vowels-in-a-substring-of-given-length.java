class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length(), i=0, j = 0;
        int res = 0, count = 0;
        for(; i<k; i++){
            if(vowel(s.charAt(i))) res++;
        }
        count = res;
        while(i<n){
            if(vowel(s.charAt(i))){
                count++;
            }
            if(vowel(s.charAt(j))){
                count--;
            }
            res = Math.max(res, count);
            i++;j++;
        }

        return res;
    }
    private boolean vowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
        return false;
    }
}
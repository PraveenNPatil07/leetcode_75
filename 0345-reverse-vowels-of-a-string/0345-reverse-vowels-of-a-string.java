class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        int i=0, j = n-1;
        char[] arr = s.toCharArray();

        for(;i<n; i++){
            if(vowel(arr[i])){
                while(i<j){
                    if(vowel(arr[j])) break;
                    j--;
                }
                if(i < j){
                    char tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    j--;
                }else break;
            }
        }
        return new String(arr);
    }
    private boolean vowel(char ch){
        String vo = "AEIOUaeiou";
        return vo.contains(ch+"");
    }
}
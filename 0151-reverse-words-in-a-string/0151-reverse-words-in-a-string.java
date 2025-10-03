class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] arr = s.split(" ");
        int n = arr.length;

        for(int i=0; i<n/2; i++){
            String temp = arr[i].trim();
            arr[i] = arr[n-1-i].trim();
            arr[n-1-i] = temp;
        }
        String res = "";
        for(int i=0; i<n; i++){
            if(arr[i] == "") continue;
            if(i == n-1){
                res += arr[i];
                break;
            }
            res += (arr[i] + " ");
        }

        return res;
    }
}
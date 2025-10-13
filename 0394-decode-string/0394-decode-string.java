class Solution {
    public String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<String> strings = new Stack<>();
        String current = "";
        int num = 0;
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '[') {
                counts.push(num);
                strings.push(current);
                current = "";
                num = 0;
            } else if (c == ']') {
                String temp = current;
                current = strings.pop();
                int count = counts.pop();
                for (int i = 0; i < count; i++) {
                    current += temp;
                }
            } else {
                current += c;
            }
        }
        return current;
    }
}
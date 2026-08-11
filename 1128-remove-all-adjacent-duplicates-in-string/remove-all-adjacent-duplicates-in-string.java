class Solution {
    public String removeDuplicates(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(!st.isEmpty() && st.peek()==ch) {
                st.pop();
            } else {
                st.push(ch);
            }
        }
        while(!st.isEmpty()) {
            res.append(st.pop());
        }
        return res.reverse().toString();
    }
}
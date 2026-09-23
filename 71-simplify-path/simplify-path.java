class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String> st = new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("") || arr[i].equals(".")) {
                continue;
            }
            else if(arr[i].equals("..")) {
                if(st.size() != 0) {
                    st.pop();
                }
            }
            else {
                st.push(arr[i]);
            }
        }
        String ans = "";
        while(st.size() != 0) {
            ans = "/" + st.pop() + ans;
        }
        if(ans.equals("")) {
            return "/";
        }
        return ans;
    }
}
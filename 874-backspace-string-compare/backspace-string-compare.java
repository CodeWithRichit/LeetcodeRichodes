class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sts=new Stack<>();
        Stack<Character> stt=new Stack<>();
        int i=0;
        while(i<s.length()){
            char c=s.charAt(i);
            if(c=='#'){
                if(sts.size()!=0){
                    sts.pop();
                }
            }
            else{sts.push(c);}
            i++;
        }
        int j=0;
        while(j<t.length()){
            char c=t.charAt(j);
            if(c=='#'){
                if(stt.size()!=0){
                    stt.pop();
                }
            }
            else{stt.push(c);}
            j++;
        }
        if(stt.size()!=sts.size())return false;
        while(stt.size()!=0 && sts.size()!=0){
            char a=stt.pop();
            char b=sts.pop();
            if(a!=b)return false;
        }
        return true;
    }
}
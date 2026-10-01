class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int i=0;
        while(i<arr.length){
            if(st.size()>0 && (st.peek()*arr[i])<0 && st.peek()>0){
                if(Math.abs(st.peek())==Math.abs(arr[i]))st.pop();
                else if(Math.abs(st.peek())<Math.abs(arr[i])){
                    while(st.size()>0 && st.peek()>0 && Math.abs(st.peek())<Math.abs(arr[i])){
                        st.pop();
                    }
                    if(st.size()==0)st.push(arr[i]);
                    else if (st.peek() < 0) {
                        st.push(arr[i]);
                    }
                    else if(Math.abs(st.peek())==Math.abs(arr[i]))st.pop();
                }
            }
            else{
                st.push(arr[i]);
            }
            i++;
        }
        ArrayList<Integer> ans=new ArrayList<>();
        while(st.size()>0)ans.add(st.pop());
        if(ans.size()==0) return new int[]{};
        Collections.reverse(ans);
        int[] a=new int[ans.size()];
        for(int k=0;k<a.length;k++){
            a[k]=ans.get(k);
        }
        return a;
    }
}
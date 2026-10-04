class Solution {
    public int timeRequiredToBuy(int[] arr, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            q.add(i);
        }
        int c=0;
        while(arr[k]!=0){
           int person = q.remove();
            arr[person]=arr[person]-1;
            c++;
            if(arr[person] > 0) {
                q.add(person);
            }
        }
        return c;
    }
}
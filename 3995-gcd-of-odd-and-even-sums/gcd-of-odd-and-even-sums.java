class Solution {
    public int gcdOfOddEvenSums(int n) {
        int se=0;
        for(int i=0;i<n;i++){
           se = se+(2*(i+1));
        }
        int so=0;
        for(int j=0;j<n;j++){
            so=so+(2*j+1);
        }
        while(se!=0){
            int temp=se;
            se=so%se;
            so=temp;
        }
        return so;
    }
}
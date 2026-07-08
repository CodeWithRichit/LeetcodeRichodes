class Solution {
    public int fib(int n) {
        // if(n==0 || n==1){
        //     return n;
        // }
        // if(n>1){
        // return fib(n-1)+fib(n-2);
        // }
        // return 1;
        int num1=0,num2=1,num=0;
        for(int i=0;i<n;i++){
            num=num1+num2;
            num1=num2;
            num2=num;
        }
        return num1;
    }
    
}
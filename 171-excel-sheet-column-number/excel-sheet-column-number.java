class Solution {
    public int titleToNumber(String columnTitle) {
        String[] arr=columnTitle.split("");
        double sum=0;
        int posn=0;
        for(int i=arr.length-1;i>=0;i--){
            int c=0;
            if(arr[posn].equals("A")){
                c=1;
            }
            else if(arr[posn].equals("B")){
                c=2;
            }
            else if(arr[posn].equals("C")){
                c=3;
            }
            else if(arr[posn].equals("D")){
                c=4;
            }
            else if(arr[posn].equals("E")){
                c=5;
            }
            else if(arr[posn].equals("F")){
                c=6;
            }
            else if(arr[posn].equals("G")){
                c=7;
            }
            else if(arr[posn].equals("H")){
                c=8;
            }
            else if(arr[posn].equals("I")){
                c=9;
            }
            else if(arr[posn].equals("J")){
                c=10;
            }
            else if(arr[posn].equals("K")){
                c=11;
            }
            else if(arr[posn].equals("L")){
                c=12;
            }
            else if(arr[posn].equals("M")){
                c=13;
            }
            else if(arr[posn].equals("N")){
                c=14;
            }
            else if(arr[posn].equals("O")){
                c=15;
            }
            else if(arr[posn].equals("P")){
                c=16;
            }
            else if(arr[posn].equals("Q")){
                c=17;
            }
            else if(arr[posn].equals("R")){
                c=18;
            }
            else if(arr[posn].equals("S")){
                c=19;
            }
            else if(arr[posn].equals("T")){
                c=20;
            }
            else if(arr[posn].equals("U")){
                c=21;
            }
            else if(arr[posn].equals("V")){
                c=22;
            }
            else if(arr[posn].equals("W")){
                c=23;
            }
            else if(arr[posn].equals("X")){
                c=24;
            }
            else if(arr[posn].equals("Y")){
                c=25;
            }
            else if(arr[posn].equals("Z")){
                c=26;
            }
            sum=sum+Math.pow(26,i)*c;
            posn++;
        }
        return (int)sum;
    }
}
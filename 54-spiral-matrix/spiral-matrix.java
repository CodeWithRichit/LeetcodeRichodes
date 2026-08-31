class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        ArrayList<Integer> arr=new ArrayList<>();
        int fr=0,fc=0,lr=mat.length-1,lc=mat[0].length-1;
        while(fr<=lr && fc<=lc){
            //right
           for(int i=fc;i<=lc;i++){
              arr.add(mat[fr][i]);
           }
           fr++;
           if(fr>lr||fc>lc){
            break;
           }
           //down
           for(int i=fr;i<=lr;i++){
            arr.add(mat[i][lc]);
           }
           lc--;
           if(fr>lr||fc>lc){
            break;
           }
           //left
           for(int i=lc;i>=fc;i--){
            arr.add(mat[lr][i]);
           }
           lr--;
           if(fr>lr||fc>lc){
            break;
           }
           //up
           for(int i=lr;i>=fr;i--){
            arr.add(mat[i][fc]);
           }
           fc++;
        }
        return arr;
    }
}
class Solution {
    public int[][] transpose(int[][] mat) {
        int[][] arr = new int[mat[0].length][mat.length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                arr[j][i]=mat[i][j];
            }
        }
        return arr;
    }
}
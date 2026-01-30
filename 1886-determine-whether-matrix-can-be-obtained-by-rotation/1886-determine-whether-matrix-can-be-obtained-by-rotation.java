class Solution {
    public static boolean isTwoMatrixEqual(int[][] mat, int[][] target) {
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]!=target[i][j]) return false;
            }
        }
        return true;
    }

    public static int[][] rotate(int[][] mat){
        int[][] output = new int[mat.length][mat.length];
        int row=0,col=mat.length-1;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                output[j][col]=mat[i][j];
            }
            col--;
        }
        return output;
    }

    public static boolean findRotation(int[][] mat, int[][] target){
        for(int i=0;i<4;i++){
            boolean isMatched = isTwoMatrixEqual(mat,target);
            if(isMatched) return true;
            else mat = rotate(mat);
        }
        return false;
    }
}
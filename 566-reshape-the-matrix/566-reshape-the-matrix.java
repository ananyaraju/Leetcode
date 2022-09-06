class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        int[] arr = new int[row*col];
        int counter = 0;
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                arr[counter] = mat[i][j];
                counter++;
            }
        }
        int[][] ans = new int[r][c];
        if (row*col == r*c) {
            int ctr = 0;
            for (int i=0; i<r; i++) {
                for (int j=0; j<c; j++) {
                    ans[i][j] = arr[ctr];
                    ctr++;
                }
            }
        }
        else {
            ans = mat;
        }
        return ans;
    }
}
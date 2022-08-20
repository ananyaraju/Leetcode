class Solution
{
    public int[][] construct2DArray(int[] original, int m, int n)
    {
        int[][] matrix=new int[m][n];
        int count=0;
        if (original.length==m*n)
        {
            for (int i=0; i<m; i++)
            {
                for (int j=0; j<n; j++)
                {
                    matrix[i][j]=original[count];
                    count++;
                }
            }
        }
        else
        {
            return new int[0][0];
        }
        return matrix;
    }
}
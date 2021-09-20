class Solution
{
    
    static void transpose(int A[][], int B[][])
    {
        int i, j;
        for (i = 0; i < N; i++)
            for (j = 0; j < N; j++)
                B[i][j] = A[j][i];
    }
     
    // Driver code
    public static void main (String[] args)
    {      
     
        transpose(A, B);     
    }
}

//took the help of geeksforgeeks solution
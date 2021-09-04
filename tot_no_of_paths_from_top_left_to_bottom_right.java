//total number of paths 
//took the help of geeksforgeeks
//topmost left most cell is (1,1)
//Solution 1

static int totNumberOfPaths(int m, int n)
{
    int[][] count = new int[m][n];

    for(int i=0;i<m;i++)
        count[i][0]=1;

    for(int j=0;j<n;j++)
        count[0][j]=1;
    
    for(int i=1;i<m;i++)
    {
        for(int j=1;j<n;j++)
        {
            count[i][j]=count[i-1][j]+count[i][j-1] //+ count[i-1][j-1];
        }

    }
    return count[m-1][n-1];
}

//T(C) = O(mn)  S(C) = O(mn)

//Solution 2


static int totNumberOfPaths(int m, int n)
{
    int[] dp = new int[n];
    dp[0]=1;

    for(int i=0;i<m;i++)
    {
        for(int j=1;j<n;j++)
        {
            dp[j] = dp[j]+dp[j-1];
        }
    }
    return dp[n-1];
}
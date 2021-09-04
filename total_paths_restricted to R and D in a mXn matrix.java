//total number of paths with restriction - right and down only
//took the help of geeksforgeeks solution

static int numberOfPaths(int m, int n)
{
    int path=1;
    for(int i=n;i<(m+n-1);i++)
    {
        path*=i;
        path/=(i-n+1);
    }
    return path;
}

//we've to calculate ((m+n-2)! / (m-1)!*(n-1)!)
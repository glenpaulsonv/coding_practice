private static int countOddProd(int[] A, int N)
{
    int las=-1;
    int count=0;
    int k=0;

    for(int i=0;i<N;i++)
    {
        if(A[i]%2==0)
        {
            k=i-last-1; //count of continuous odd numbers between two even numbers 
            count=count+(k*(k+1)/2);
            last=i;
        }
        k=N-last-1;
        count=count+(k*(k+1)/2);
        return count;
    }
}
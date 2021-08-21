int power(int a, int N)
{
    if(N==0) return 1;
    if(N==1) return a;
    else
    {
        int R = power(a, N/2);
        if(N%2==0)
            return R*R;
        else
            return R*a*R;
    }
}

//Time complexity O(logN)

power(a,N)
{
    if(N is even)
        return ((power(a,N/2)%M)*(power(a,N/2)%M))%M;
    else 
        return return ((power(a,N/2)%M)*(power(a,N/2)%M)*a)%M;
}
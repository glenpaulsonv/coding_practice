
//solution_1 geeksforgeeks

private static int gcd(int a, int b)
{
    if(a==0)
        return b;
    if(b==0)
        return a;
    if(a==b)
        return a;
    if(a>b)
        gcd(a-b,b) //Euclidean Algorithm
    return gcd(a,b-a);
}

//soltuion_2 

private static int gcd(int a, int b)
{
    int gcd=1;
    for(int i=1;i<=a && i<=b;i++)
    {
        if(a%i==0 && b%i==0)
        {
            gcd=i;
        }

    }

}

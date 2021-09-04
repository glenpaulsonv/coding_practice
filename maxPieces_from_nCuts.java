//lazy caterer - max pieces from n cuts

static int maxPieces(int n)
{
    return (n*(n+1))/2 + 1;
}

// f(0) = 1; f(1) = 2; f(2) = 4; f(n)=n+f(n-1);
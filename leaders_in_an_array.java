//leaders in an array - took the help of geeksforgeeks solutions

//hint - scan from the right

void printLeaders(int[] arr, int n)
{
    int maxFromRight = arr[n-1];

    System.out.println(maxFromRight);
    for(int i=n-2;i>=0;i--)
    {
        if(arr[i]>maxFromRight)
            System.out.println(arr[i]+" ");
    }
}
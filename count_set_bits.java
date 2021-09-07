//count the number of set bits in a number

class countSetBits
{
    public static int countSetBits(int n)
    {
        int count=0;
        while(n>0)
        {
            n&=(n-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args)
    {
        
    }
}
//gcd of an array
class Solution
{
    public static int gcdOfTwo(int a, int b)
    {
        if(a==0)
            return b;
        return gcdOfTwo(b%a,a);
    }
    public int gcd(int N , int arr[]) 
    { 
       //code here.
       int res=0;
       for(int i:arr)
       {
           res=gcdOfTwo(res,i);
           
           //if(res==1) return 1;
           
       }
       return res;
    } 
}
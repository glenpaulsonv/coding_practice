//armstrongNumber 
class Solution {
    static String armstrongNumber(int n){
        // code here
        int b=n;
        int sum=0;
        while(n>0)
        {
            int m=n%10;
            sum+=Math.pow(m,3);
            n/=10;
        }
        String s="";
        if(sum==b)
            s="Yes";
        else
            s="No";
        return s;
    }
}
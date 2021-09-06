class Solution{
    
    
    static int isBitSet(int N){
        //code here
        while(N > 0 )
        {
            int rem=N%2;
            N/=2;
            
            if(rem!=1)
                return 0;
        }
        return 1;
    }
}
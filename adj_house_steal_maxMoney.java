class Solution {
    static int maximizeMoney(int N , int K) {
        // code here
        if(N%2==0)
        {
            return (N/2)*K;
        }
        else
        {
            return ((N/2)+1)*K;
        }
    }
};

//robber cannot steal from adjacent house;
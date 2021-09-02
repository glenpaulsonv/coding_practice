//atoi - approach 3 - geeksforgeeks 

class atoi
{
    public static int atoi(String str)
    {
        if(str.length()==0)
        {
            return -1;

        }

        int sign=1;
        int res=0;

        int i=0;
        if(str.charAt(i)=='-')
        {
            sign=-1;
            i++;
        }
        for(;i<str.length();i++)
        {
            if(Character.isDigit(str.charAt(i))==false) return -1;
        
        res=res*10+Character.getNumericValue(str.charAt(i));
        }
        return sign*res;
    }
}

//atoi approach 4 - considering all 4 corner cases - leading white spaces, sign, overflow and invalid input

class atoi{
    static int solveAtoI(char[] str)
    {
        int sign=1; base=0;
        int i=0;
        while(str[i]==' ')
        {
            i++;
        }
        if(str[i]=='-'||str[i]=='+')
        {
            sign=1 - 2 * (str[i++]=='-'?1:0);
        }

        while(i<str.length && str[i]>='0' && str[i]<='9')
        {
            if(base>Integer.MAX_VALUE/10 || (base==Integer.MAX_VALUE/10 && str[i]-'0' > 7))
            {
                if(sign == 1)
                    return Integer.MAX_VALUE;
                else
                    return Integer.MIN_VALUE;
            }
            base = 10 * base + str[i++] - '0';
        }
        return base*sign;
    }
}
private static boolean canFormPalindrome(String str)
{
    int no_of_chars = 256;
    int count[]=new int[256];

    Arrays.fill(count,0); //note down

    for(int i=0;i<str.length();i++)
    {
        count[(int)(str.charAt(i))]++;

    }

    int oddCount=0;
    for(int i=0;i<no_of_chars;i++)
    {
        if((count[i] & 1) == 1 )
            odd++;
        
        if(odd>1)
            return false;
    }
    return true;
}
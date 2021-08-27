private static boolean checkSubstringPalindrome(String str1, String str2)
{
    boolean[] status = new boolean[26];
    Arrays.fill(status, false);

    for(int i=0;i<str1.length();i++)
    {
        status[str1.charAt(i)-'a']=true;
    }

    for(int i=0;i<str2.length();i++)
    {
        if(status[str2.charAt(i)-'a'])
            return true;
    }
    return false;
}
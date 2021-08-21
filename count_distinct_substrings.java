public static int distinctSubstring(String str)
{
    HashSet<String> set = new HashSet<>();
    for(int i=0;i<=str.length();i++)
    {
        for(int j=i+1;j<=str.length();j++)
        {
            set.add(str.substring(i,j));
        }
    }
    return set.size();
}
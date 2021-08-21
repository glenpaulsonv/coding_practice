public static int countDistCharDistSubstrings(String str)
{
    int count=0;
    HashSet<String> distSubString = new HashSet<>();
    for(int i=0;i<str.length();i++)
    {
        String temp="";
        HashSet<Character> distChar = new HashSet<>();

        for(int j=i;j<str.length();j++)
        {
            temp=temp+str.charAt(j);
            distChar.add(str.charAt(j));
            if(!distSubString.contains(temp))
            {
                distSubString.add(temp);
                count+=distChar.size();
            }
        }
    }
    return count;
}

//took the help of geeksforgeeks solution
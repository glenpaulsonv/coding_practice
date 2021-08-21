public static void allSubStrings(String str)
{

    for(int i=0;i<str.length();i++)
    {
        for(int j=i+1;j<=str.length();j++)
        {
            System.out.println(str.substring(i,j));
        }
    }
}

//took the help of geeksforgeeks solution
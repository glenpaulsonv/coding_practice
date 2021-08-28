//remove k adjacents from a string

private static void remove(String string, int k)
{
    StringBuilder sb = new StringBuilder(string);

    Stack<Integer> count=new Stack<>();

    for(int i=0;i<sb.length();i++)
    {
        if(i==0 || sb.charAt(i) != sb.charAt(i-1))
        {
            count.push(1);
        }
        else
        {
            int inc = count.pop()+1;
            if(inc==k)
            {
                sb.delete(i-k+1,i+1);
                i=i-k;
            }
            else
            {
                count.push(inc);
            }
        }
    }
}
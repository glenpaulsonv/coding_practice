private static void find(String str)
{
    int[] count=new int[26];
    Queue<Character> q = new LinkedList<Character>();

    for(int i=0;i<str.length();i++)
    {
        char ch=str.charAt(i);
        q.add(ch);
        count[ch-'a']++ //Note it down
        while(!q.isEmpty())
        {
            if(count[q.peek()-'ch']>1)
            {
                q.remove();
            }
            else
            {
                System.out.println(q.peek()+" ");
                break;
            }
        }
        if(q.isEmpty())
        {
            System.out.println(-1 + " ");
        }
    }
}
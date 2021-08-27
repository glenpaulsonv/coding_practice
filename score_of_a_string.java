private static int score(String s)
{
    Stack<String> stk = new Stack<>();
    int res=0;

    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)=="(")
        {
            stk.push("(");
        }
        else
        {
            if(stk.peek=="(")
            {
                stk.pop();
                stk.push("1");
            }
            else
            {
                int c=0;
                while(stk.peek() != "(")
                {
                    c += Integer.parseInt(stk.peek());
                    stk.pop();
                }
                stk.pop();
                stk.push(String.valueOf(2*c));

            }
            
            
        }
        
    }
    while(!stk.isEmpty())
    {
        res+=Integer.parseInt(stk.peek());
        stk.pop();
    }
    return res;
}
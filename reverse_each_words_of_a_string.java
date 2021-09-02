String reverseWords(String s)
    {
        // your code here
        Stack<Character> stack = new Stack<>();
        String res="";
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='.')
            {
                stack.push(s.charAt(i));
            }
            else
            {
                while(!stack.isEmpty())
                {
                    //System.out.print(stack.pop());
                    res+=stack.pop();
                }
                //System.out.print(".");
                res+=".";
            }
            
        }
        while(!stack.isEmpty())
        {
            //System.out.print(stack.pop());
            res+=stack.pop();
        }
        return res;
    }
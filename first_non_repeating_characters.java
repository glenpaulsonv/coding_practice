public String FirstNonRepeating(String A)
    {
       
      int[] count=new int[26];
      Queue<Character> q = new LinkedList<Character>();
      String res="";

        for(int i=0;i<A.length();i++)
        {
            char ch=A.charAt(i);
            q.add(ch);
            count[ch-'a']++; //Note it down
        
            while(!q.isEmpty())
            {
                if(count[(q.peek()-'a')]>1)
                {
                    q.remove();
                }
                else
                {
                    //System.out.println(q.peek()+" ");
                    res+=q.peek();
                    break;
                }
        }
        if(q.isEmpty())
        {
            //System.out.println(-1 + " ");
            res+="#";
        }
        
    }
    return res;
    
}
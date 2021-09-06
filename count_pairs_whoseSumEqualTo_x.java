public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
        // add your code here
        HashSet<Integer> set = new HashSet<>();
        int count=0;
        
        Iterator<Integer> itr1 = head1.iterator();
        Iterator<Integer> itr2 = head2.iterator();
        
        
        while(itr1.hasNext())
        {
            set.add(itr1.next());
        }
        
        //LinkedList curr2 = head2;
        while(itr2.hasNext())
        {
            if(set.contains(x-itr2.next()))
            {
               
               count++;
            }
            
            
        }
        return count;
    }
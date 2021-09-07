//k distance from root

//sol1 - gfg company wise section - improvised solution

class Tree
{
 
     ArrayList<Integer> Kdistance(Node root, int k)
     {
          ArrayList<Integer> al = new ArrayList<Integer>();
          Kdistance(al,root,k);
          return al;
     }
     private void Kdistance(ArrayList<Integer> al,Node root, int k)
     {
         if(root!=null)
         {
             if(k==0)
            {
                 al.add(root.data);
            }
            
            
            Kdistance(al,root.left,k-1);
            Kdistance(al,root.right,k-1);
         }
         
     }
}

//Solution 2 - geeksforgeeks tutorial solution

class BinaryTree
{
    Node root;

    void kDistance(Node root, int k)
    {
        if(node == null || k<0)
            return;
        if(k==0)
            System.out.println(Node.data+" ");
            return;
        
        kDistance(Node.left, k-1);
        kDistance(Node.right, k-1);
    }
}
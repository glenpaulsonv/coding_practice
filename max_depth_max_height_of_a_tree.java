//max-depth of a tree - took the help of geeksforgeeks solution

/* class Node{
    int data;
    Node left, right;

    Node(int item)
    {
        data=item;
        left=rigth=null;
    }
}
*/


static int maxDepth(Node node)
{
    if(node == null)
        return 0;
    
    else
    {
        int lDepth = maxDepth(node.left);
        int rDepth = maxDepth(node.right);

        if(lDepth>rDepth)
            return(lDepth+1); //+1 for the current node
        else    
            return(rDepth+1);
    }
}
//mirror tree - sol2 - took the help of geeksforgeeks solution

staic class Node{
    int data;
    Node left,right;

}

static Node newNode(int data)
{
    Node node = new Node();
    node.data = data;
    node.left=null;
    node.right=null;
    return node;
}

static void mirror(Node root)
{
    if(root==null)
        return;
    
    Queue<Node> q = new LinkedList<>();

    q.add(root);

    while(q.size()>0)
    {
        Node curr = q.peek();
        q.remove();

        Node temp = curr.left;
        curr.left = curr.right;
        curr.right = temp;

        if(curr.left!=null)
            q.add(curr.left);
        if(curr.right!=null)
            q.add(curr.right);
    }
}

Static void inOrder(Node node)
{
    if(node == null)
        return;
    
    inOrder(node.left);
    System.out.print(node.data+" ");
    inOrder(node.right);
}
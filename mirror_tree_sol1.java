//mirror a tree - took the help of geeksforgeeks solution 

class Node
{
    int data;
    Node left, right;

    public Node(int item)
    {
        data = item;
        left=right=null;
    }
}

class BinaryTree
{
    Node root;

    void mirror()
    {
        root = mirror(root);
    }

    Node mirror(Node node)
    {
        if(node == null)
            return node;
        
        Node left = mirror(node.left);
        Node right = mirror(node.right);

        node.left=right;
        node.right=left;

        return node;
    }

    void inOrder()
    {
        inOrder(root);
    }

    void inOrder(Node node)
    {
        if(node==null)
            return;

        inOrder(node.left);
        System.out.println(node.data+" ");
        inOrder(node.right);
    }
}
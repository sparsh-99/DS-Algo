//User function Template for Java



//User function Template for Java

/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree
{
    ArrayList<Integer> postOrder(Node root)
    {
       ArrayList<Integer> li = new ArrayList<>();
       postorder(root, li);
       return li;
    }
    public static void postorder(Node root, ArrayList li){
        if(root!=null){
            postorder(root.left, li);
            postorder(root.right, li);
            li.add(root.data);
        }
    }
}

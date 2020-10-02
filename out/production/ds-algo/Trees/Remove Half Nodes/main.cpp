/*Complete the function below
Node is as follows:
struct Node {
    int data;
    Node *left;
    Node *right;

    Node(int val) {
        data = val;
        left = right = NULL;
    }
};
*/

// Return the root of the modified tree after removing all the half nodes.
Node *RemoveHalfNodes(Node *root)
{
   if(root==NULL) return root;
   root->left = RemoveHalfNodes(root->left);
   root->right = RemoveHalfNodes(root->right);
   while(root->left && !root->right)
        return root->left;
   while(root->right && !root->left)
        return root->right;
    return root;
}
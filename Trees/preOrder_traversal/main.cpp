
/* A binary tree node has data, pointer to left child
   and a pointer to right child  

/*
struct Node
{
    int data;
    struct Node* left;
    struct Node* right;
    
    Node(int x){
        data = x;
        left = right = NULL;
    }
};
*/

void preOrder(Node *root,vector<int> &temp){
    if(root==NULL) return;
    temp.push_back(root->data);
    preOrder(root->left,temp);
    preOrder(root->right,temp);
}
vector <int> preorder(Node* root)
{
    vector<int> temp;
    preOrder(root,temp);
    return temp;
}
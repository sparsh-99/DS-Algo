/*Example :

Sample Input:
3
1 2 3
2 N 1 3 N
10 20 30 40 60 N N

Sample Output:
2
3
3

Explanation:
Testcase1: The tree is
        1
      /   \
     2     3
So, the height would be 2.


Testcase2: The tree is
                           2
                              \
                               1 
                              /    
                          3
So, height would be 3.

*/






/* Tree node structure  used in the program

struct Node {
    int data;
    Node *left;
    Node *right;

    Node(int val) {
        data = val;
        left = right = NULL;
    }
};*/

// return the Height of the given Binary Tree
int height(Node* root)
{
   if(root==NULL)
        return 0;
   int left = height(root->left);
   int right = height(root->right);
   
   int max1 = max(left, right);
   
   return 1+max1;
    
}
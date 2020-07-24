/*
Output:
For each testcase, in a new line, print inorder traversal of mirror tree.

Your Task:
You don't have to take any input. Just complete the function mirror() that takes node as paramter  and convert it into its mirror. The printing is done by the driver code only.
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the Tree).

Constraints:
1 <= T <= 100
1 <= Number of nodes <= 100
1 <= Data of a node <= 1000

Example:
Input:
2
1 3 2
10 20 30 40 60
Output:
2 1 3
30 10 60 20 40

Explanation:
Testcase1: The tree is
       1         (mirror)       1
     /   \         =>         /   \
   3       2                 2     3
The inorder of mirror is 2 1 3
Testcase2: The tree is
                           10                               10
                        /     \           (mirror)       /      \
                     20        30            =>        30        20
                    /   \                                       /    \
                  40     60                                    60    40
The inroder traversal of mirror is 30 10 60 20 40.
*/




/* A binary tree node has data, pointer to left child
   and a pointer to right child /
struct Node
{
    int data;
    struct Node* left;
    struct Node* right;
    
    Node(int x){
        data = x;
        left = right = NULL;
    }
}; */

/* Should convert tree to its mirror */
void mirror(Node* node) 
{
     if(node!=NULL){
         mirror(node->left);
         mirror(node->right);
         swap(node->left, node->right);
     }
        
}
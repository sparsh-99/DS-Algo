/* Link list Node 
struct Node {
    int data;
    Node* next;
    
    Node(int x){
        data = x;
        next = NULL;
    }
    
}; */



int getMiddle(Node *head)
{
   if(head == NULL) return -1;
   Node *curr = head;
   int c=0;
   while(curr!=NULL){
       c++;
       curr = curr->next;
   }
   Node *start = head;
   for(int i=0;i<c/2;i++)
        start = start->next;
    return start->data;
}

void deleteAlt(struct Node *head){
    // Code here
    while(head!=NULL && head->next!=NULL)
    {
        head->next = head->next->next;
        head = head->next;
    }
}
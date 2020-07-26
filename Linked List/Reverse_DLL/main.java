public static Node reverseDLL(Node  head)
{
    Node temp=null,curr=head;
        while(curr!=null){
        temp=curr.prev;
        curr.prev=curr.next;
        curr.next=temp;
        curr=curr.prev;
    }
    if(temp!=null){
    head=temp.prev;
    }
    return head;
}
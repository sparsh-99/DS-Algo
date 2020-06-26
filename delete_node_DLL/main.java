/* Structure of linkedlist node
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int d)
	{
		data = d;
		next = prev = null;
	}
}
*/
class GfG
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
        int c = 1;
        Node temp = head;
        if(x==1){
            head = temp.next;
        }
        else{
            while(c!=x){          // loop until we reach the deleted node
                temp = temp.next;   
                c++;
            }
            temp.prev.next = temp.next;   
        }
        return head;
    }
}
import java.util.*;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
    }
}


class Main{
    static Node insertNode(Node head, int data)
  {
    Node new_node = new Node(data);
    Node tail = head;
    new_node.next = null;   // link new node to NULL as it is last node
    if (head == null)  // if list is empty add in beginning.
    {
      head = new_node;
      return head;
    }
    while (tail.next != null)  // Find the last node
      tail = tail.next;
    tail.next = new_node;  // Add the node after the last node of list
    return head;
  }

    static Node copyList(Node org)
    {
	Node c= org ,head = null;
    while(c!= null){
        Node n = new Node(c.data);
        if(head == null){
            head = n;
        }
        else{
            Node d = head;
            while(d.next != null){
            d = d.next;
        }
        d.next = n;
        }
    c = c.next;
  }
  return head;
}
    static void forwardPrint(Node head){
        Node current_node = head;
        while(current_node!=null){
            System.out.print(current_node.data +" ");
            current_node = current_node.next;
        }
    }
    public static void main(String[] args){
        //ria
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t>0){
            Node head = null;
            Node head2 = null;
            int n = Integer.parseInt(sc.nextLine());
            while(n>0){
                int m = Integer.parseInt(sc.nextLine());
                head = insertNode(head, m);
                n--;
            }
            head2 = copyList(head);
            if(head2!=null && head2==head) 
                System.out.print("Don't be Smart");
            else
                forwardPrint(head2);
            System.out.print("\n");
            t--;
        }
        sc.close();
    }
}
import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
    }
}


public class PrintLL {
    static Node insertNode(Node head, int data){
        Node new_node = new Node(data);
        Node last = head;
        new_node.next = null;
        if(head==null){
            head= new_node;
            return head;
        }
        while(last.next!=null){
            last = last.next;
        }
        last.next = new_node;
        return head;
    }
    static void forwardPrint(Node head){
        while(head!=null){
            System.out.print(head.data +"-");
            head = head.next;
        }
    }
    static void backwardPrint(Node head){
        if(head!=null){
            backwardPrint(head.next);
            System.out.print(head.data+"-");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t>0){
            Node head = null;
            int n = Integer.parseInt(sc.nextLine());
            while(n>0){
                int m = Integer.parseInt(sc.nextLine());
                head = insertNode(head, m);
                n--;
            }
            forwardPrint(head);
            System.out.print("\n");
            backwardPrint(head);
            System.out.print("\n");
            t--;
        }
    }
}
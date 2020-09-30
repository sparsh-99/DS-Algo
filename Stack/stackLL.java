import java.util.*;
import java.io.*;

class Node {
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}

class Stack {
    Node top;
    void push(int d)
    {
        Node n=new Node(d);
        n.next=top;
        top=n;
    }
    
    void pop()
    {
        if(top==null)
        {
            System.out.println("Underflow");
        }
        else
        {
            System.out.print(top.data + " ");
            top=top.next;
        }
    }
    
    void peek()
    {
        if(top==null)
        {
            System.out.println("No element in the Stack");
        }
        else
        {
            System.out.println(top.data);
        }
    }
}

class GFG {
	public static void main (String[] args) {
	    Stack s=new Stack();
	    s.push(5);
	    s.push(3);
	    s.push(8);
	    s.pop();
	    s.pop();
	    s.pop();
	    s.peek();
	    s.pop();
	    s.peek();
	}
}
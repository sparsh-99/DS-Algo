/*
The structure of the node of the stack is
class StackNode
{
    int data;
    StackNode next;
    StackNode(int a)
    {
       data = a;
       next = null;
    }
}
*/
class MyStack {

    // Note that top is by default null
    // in Java
    StackNode top;

    void push(int a) {
        StackNode temp = new StackNode(a);
        if(temp==null)
            top = temp;
        else{
            temp.next = top;
            top = temp;
        }
    }
    int pop() {
        int a;
        // Add your code here
        if(top==null)
            return -1;
        else{
            a = top.data;
            top = top.next;
        }
        return a; 
    }
}
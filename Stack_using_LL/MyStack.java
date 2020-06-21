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
        // Add your code here
        if(top==null){
            top=new StackNode(a);
        }
        else{
            StackNode node=new StackNode(a);
            node.next=top;
            top=node;
        }
    }
    int pop() {
        // Add your code here
        int num=-1;
        if(top!=null)
        {
            num=top.data;
            top=top.next;
        }
        return num;
    }
}
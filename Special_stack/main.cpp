/*Complete the function(s) below*/
void push(int a)
{
     //add code here.
     s.push(a);
}

bool isFull(int n)
{
     //add code here.
     if(s.size()==n) return true;
     else return false;
}

bool isEmpty()
{
    //add code here.
    return s.empty();
    
}

int pop()
{
    //add code here.
    s.pop();
}

int getMin()
{
   //add code here.
   int min = 99999;
   while(!s.empty()){
       if(s.top()<min)
           min=s.top();
       s.pop();
   }
   return min;
}
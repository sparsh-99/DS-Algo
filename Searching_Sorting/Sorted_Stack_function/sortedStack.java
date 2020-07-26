class sortedStack{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		Stack<Integer> tempStack = new Stack<Integer>();
		while(!s.isEmpty()){
		    int tmp = s.pop();
		    while(!tempStack.isEmpty() && tempStack.peek() > tmp){
		        s.push(tempStack.pop());
		    }
		    tempStack.push(tmp);
		}
		return tempStack;
	}
}
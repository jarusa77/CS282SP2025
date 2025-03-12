
public class Stack 
{
	private class Node
	{
		public int data;
		public Node tail;
		
		Node(int input)
		{
			data=input;
			tail =null;
		}
	}
	
	Node  Head;
	int Size;
	
	Stack()
	{
		Head=null;
		Size=0;
	}
	
	
	
	//Push
	public void Push(int input)
	{
		Node temp = new  Node(input);
		
		temp.tail = Head;
		Head=temp;
		Size++;
	}
	
	
	public int Pop()
	{
		if(isEmpty())
			return  -99999;
		
		int value = Head.data;
		Head=Head.tail;
		Size--;
		
		return value; 
	}
	
	
	public int Top()
	{
		if(isEmpty())
			return  -99999;
		
		return Head.data;
	}
	
	public int getSize()
	{
		return Size;
	}
	
	public boolean isEmpty()
	{
		if(Head==null)
			return true;
		
		return false;//is not empty
	}
}

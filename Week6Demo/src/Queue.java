public class Queue 
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
	
	Node Front;
	Node Back;
	int Size;
	
	Queue()
	{
		Front=null;
		Back=null;
		Size=0;
	}
	public void Enqueue(int input)
	{
		Node temp= new  Node(input);
		
		if(isEmpty())
		{
			Back=temp;
			Front=Back;
		}
		else
		{
			Back.tail=temp;
			Back=Back.tail;
		}
		Size++;
	}
	
	public int Dequeue()
	{
		if(isEmpty())
			return -99999;
		
		int  value = Front.data;
		
		if(Front == Back)
			Back=null;
		
		Front=Front.tail;
		Size--;
		
		return value;
	}
	
	
	public  int  First()
	{
		return Front.data;
	}
	
	public int GetSize()
	{
		return Size;
	}
	
	public boolean isEmpty()
	{
		if(Front==null)
			return true;
		
		return false;
	}
	
	

}

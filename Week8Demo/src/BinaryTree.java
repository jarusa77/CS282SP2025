
public class BinaryTree 
{
	private class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int input)
		{
			left=null;
			right=null;
			data = input;
		}
	}

	Node Root;
	Node CurrentPos;
	int Height;

	
	BinaryTree()
	{
		Root=null;
		CurrentPos=null;
		Height = -1;
				
	}
	
	public void Add(int input)
	{
		if(Root==null)
		{
			Root =new Node(input);
			Height++;
		}
		else
		{
			AddNode(Root,input,0);
		}
	}
	
	private boolean AddNode(Node root, int input, int height)
	{
		
		if(Height==height)
		{
			root.left=new Node(input);
			Height++;
			return true;
		}
		
		if(Height>height)
		{
			if(root.left==null)
			{
				root.left=new Node(input);
				return true;	
			}
			else if(root.right==null)
			{
				root.right=new Node(input);
				return true;
			}
		   
			if(AddNode(root.left,input,height+1))
				return true;
			if(AddNode(root.right,input,height+1))
				return true;

		}
		
		return false;
		
	}
	
	public int GetHeight()
	{
		return Height;
	}
	public boolean isEmpty()
	{
		if(Root==null)
			return true;
		return false;
	}
	
	public boolean Find(int input)
	{

		return searchNode(Root, input);
		
	}
	
	private boolean searchNode(Node root, int input)
	{
		if(root.data == input)
		{
			CurrentPos=root;
			return true;
		}
		
		if(root.left!=null)
			if(searchNode(root.left,input))
				return true;
		
		if(root.right!=null)
			if(searchNode(root.right,input))
				return  true;
		
		return false;
	}
	
	public int GetCurrentData()
	{
		if(CurrentPos!=null)
			return CurrentPos.data;
		
		return -9999;
	}
	
	public void printIteration()
	{
		printNodes(Root);
	}
	
	private void printNodes(Node root)
	{
		if(root.left!=null)
			printNodes(root.left);
		System.out.println(root.data +  ", ");
		if(root.right!=null)
			printNodes(root.right);
	}
	
	//FindParentNode
	//Delete
	
}

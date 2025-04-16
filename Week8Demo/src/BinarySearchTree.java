public class BinarySearchTree 
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
	
	BinarySearchTree()
	{
		Root=null;
		CurrentPos=null;
		
	}
	
	public void Add(int input)
	{
		if(Root==null)
		{
			Root = new Node(input);
		}
		else
		{
			AddNode(Root,input);
		}
	}
	
	private void AddNode(Node root, int input)
	{
		if(input<root.data)//go left
		{
			if(root.left==null)
			{
				root.left=new Node(input);
			}
			else
			{
				AddNode(root.left,input);
			}
		}
		else //go right
		{
			if(root.right==null)
			{
				root.right=new  Node(input);
			}
			else
			{
				AddNode(root.right,input);
			}
		}
	}
	
	public boolean Find(int input)
	{

		return searchNode(Root, input);
		
	}
	
	private boolean searchNode(Node root,int input)
	{
		if(root.data==input)
		{
			CurrentPos=root;
			return true;
		}
		else if(input < root.data) //left
		{
			if(root.left!=null)
			{
				return searchNode(root.left,input);
			}
			else
			{
				return false;
			}
		}
		else //right
		{
			if(root.right!=null)
			{
				return searchNode(root.right,input);
			}
			else
			{
				return false;
			}
		}
	}
	
	
	public int GetCurrent()
	{
		if(CurrentPos!=null)
			return CurrentPos.data;
		
		return -9999;
	}
	
	
	private Node FindParent(Node root,Node child)
	{
		if(child.data<root.data)//left
		{
			if(root.left==child)
				return root;
			
			return FindParent(root.left,child);
		}
		else//right
		{
			if(root.right==child)
				return root;

			return FindParent(root.right,child);
		}
	}
	
	
	
	
	public boolean Delete(int input)
	{
		if(!Find(input))
		{
			return false;
		}
		
		Node parent = FindParent(Root,CurrentPos);
		
		if(CurrentPos.left==null &&// No Children
		   CurrentPos.right==null)
		{			
			if(CurrentPos.data<parent.data)
				parent.left=null;
			else
				parent.right=null;
			return true;
		}
		else if(CurrentPos.right==null)//Left Child
		{
			if(CurrentPos.data<parent.data)
				parent.left=CurrentPos.left;
			else
				parent.right=CurrentPos.left;
			return true;
		}
		else if(CurrentPos.left==null)//Right Child
		{
			if(CurrentPos.data<parent.data)
				parent.left=CurrentPos.right;
			else
				parent.right=CurrentPos.right;
			return true;
		}
		else //both right and  left child
		{
			return  false;
			//get Left most Right Decendent
			//int LMRData =  GetLMR(CurrentPos.right);
		}
	}
	
	/*
	private int GetLMR(Node root)
	{
		int data;
		if(root.left==null)
		{
			
		}
			
		
		return GetLMR(root.left);
	}
	
	*/
	
	

	
	
	public void printIteration()
	{
		printNodes(Root);
	}
	
	private void printNodes(Node root)
	{
		
		//InOrder Traversal 
		if(root.left!=null)
			printNodes(root.left);
		System.out.println(root.data +  ", ");
		if(root.right!=null)
			printNodes(root.right);
	}

}


public class Week8Demo 
{

	public static void main(String[] args) 
	{
		/*
		BinaryTree BT = new BinaryTree();
		
		BT.Add(15);
		BT.Add(20);
		BT.Add(12);
		BT.Add(13);
		BT.Add(14);
		BT.printIteration();
		
		if(BT.Find(20))
		{
			System.out.println(BT.GetCurrentData());
		}
		else
			System.out.println("Not Found!");
			*/
		
		BinarySearchTree bst =  new BinarySearchTree();
		
		bst.Add(50);
		bst.Add(25);
		bst.Add(75);
		bst.Add(13);
		bst.Add(87);
		bst.Add(30);
		bst.Add(35);
		
		bst.printIteration();
		
		
		
		if(bst.Find(1))
		{
			System.out.println("Found "+ bst.GetCurrent());
		}
		else
		{
			System.out.println("Not Found!!");
		}
		
		bst.printIteration();
		System.out.println("/n-----------------/n");
		bst.Delete(50);
		bst.printIteration();
		
		
	}

}

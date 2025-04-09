
public class Week8Demo 
{

	public static void main(String[] args) 
	{
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
		
		
		

	}

}

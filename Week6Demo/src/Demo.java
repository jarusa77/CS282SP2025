
public class Demo 
{

	public static void main(String[] args) 
	{
		/*
		Stack s = new Stack();
		
		s.Push(25);
		s.Push(39);
		s.Push(52);
		
		System.out.println(s.Top());
		s.Push(20);
		System.out.println(s.Pop());
		System.out.println(s.Pop());
		System.out.println(s.Pop());
		System.out.println(s.Pop());
		System.out.println(s.Pop());
		*/
		
		Queue q = new  Queue();
		
		q.Enqueue(45);
		System.out.println(q.First());
		q.Enqueue(2);
		System.out.println(q.Dequeue());
		q.Enqueue(99);
		System.out.println(q.First());
		q.Enqueue(15);
		System.out.println(q.Dequeue());
		System.out.println(q.First());
	}

}

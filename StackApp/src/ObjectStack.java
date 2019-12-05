
public class ObjectStack implements Stack {
	
	protected int max_size;
	protected Object[] stackelements;
	protected int flag;
	protected int curr;
	public ObjectStack(int n)
	{
		stackelements=new Object[n];
		max_size=n;
		curr=-1;
	}
	public int size()
	{
		return curr+1;
	}
	public boolean isEmpty()
	{
		if(curr==-1)
			return true;
		else
			return false;
	}
	public void clear()
	{
		int i;
		for(i=0;i<curr+1;i++)
			stackelements[i]=null;
		curr=-1;
	}
	public void push(Object element) throws RuntimeException
	{
		try
		{
			if(curr+1==max_size)
				throw new RuntimeException();
			else
			{
				stackelements[++curr]=element;
				flag=1;
			}
		}
		catch(RuntimeException StackFullException)
		{
			System.out.printf("Stack is Full!\n");
		}
	}
	public Object peek()
	{
		return stackelements[curr];
	}
	public Object pop()
	{
		if(isEmpty())
			return null;
		flag=0;
		return stackelements[curr--];
	}
	public int getflag()
	{
		return flag;
	}

}

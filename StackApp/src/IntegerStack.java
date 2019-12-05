import java.util.InputMismatchException;

public class IntegerStack extends ObjectStack {
	protected Integer[] elements;
	protected int lastpopvalue;
	public IntegerStack(int n)
	{
		super(n);
		elements=new Integer[n];
	}
	public void push(Object elemnt) throws RuntimeException
	{
		try
		{
			if(curr+1==max_size)
				throw new RuntimeException();
			else if(elemnt instanceof Integer)
			{
				elements[++curr]=(Integer)elemnt;
				flag=1;
			}
			else
				throw new InputMismatchException();
		}
		catch(InputMismatchException e)
		{
			System.out.printf("Only integer value!\n");
		}
		catch(RuntimeException r)
		{
			System.out.printf("Stack is full!\n");
		}
		finally
		{
			System.out.printf("%s",toString());
		}
	}
	public Object pop()
	{
		
		if(isEmpty())
			return null;
		flag=0;
		lastpopvalue=elements[curr].intValue();
		curr--;
		System.out.printf("%s",toString());
		return (Integer)lastpopvalue;
	}
	public Object peek()
	{
		return elements[curr];
	}
	public void clear()
	{
		int i;
		for(i=0;i<curr+1;i++)
			elements[i]=null;
		curr=-1;
	}
	public String toString()
	{
		int temp_curr=curr;
		String string="(";
		String value;
		if(curr==-1)
			return String.format("Stack is empty!\n");
		else
		{
			while(temp_curr!=-1)
			{
				value=String.valueOf(elements[temp_curr--].intValue());
				string = string + value;
				if(temp_curr==-1)
				{
					string = string + ")";
				}
				else
					string = string + ",";
				
			}
			return String.format("%s\n",string);
		}
		}
		
	}


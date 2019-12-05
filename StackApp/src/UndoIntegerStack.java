
public class UndoIntegerStack extends IntegerStack{
	public UndoIntegerStack(int n)
	{
		super(n);
	}
	public void undo()
	{
		if(flag==1)
			pop();
		else
			push(lastpopvalue);
	}
	

}

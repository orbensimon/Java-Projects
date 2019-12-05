
public class StackApp {
	public static void main(String[] args)
	{
		UndoIntegerStack myStack = new UndoIntegerStack (5);
		myStack.push(1.5);
		myStack.push(2);
		myStack.undo();
		myStack.push(4);
		myStack.push(5);
		myStack.push(6);
		myStack.push(5);
		myStack.push(6);
		myStack.push(7);
		myStack.undo();
		int i=(int)myStack.pop();
		myStack.undo();
	}

}

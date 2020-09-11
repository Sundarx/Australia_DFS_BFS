//SUNDAR RAJ
public class StackLinkedList<T>
{
	private GraphNode<T> stackTop;

	public StackLinkedList()
	{
		stackTop = null;
	}

	public StackLinkedList(GraphNode<T> top)
	{
		stackTop = top;
	}

	public void setTop(GraphNode<T> top)
	{
		stackTop = top;
	}

	public GraphNode<T> getTop()
	{
		return stackTop;
	}

	public boolean isEmpty()
	{
		return (stackTop == null);
	}

	public void ifEmpty() throws EmptyStackException
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
	}

	public void push(GraphNode<T> root)
	{
		if(isEmpty())
		{
			setTop(root);
		}
		else
		{
			GraphNode<T> newTop = root;
			newTop.setNext(getTop());
			setTop(newTop);
		}
	}

	public GraphNode<T> peek() throws EmptyStackException
	{
		ifEmpty();
		return getTop();
	}

	public void pop() throws EmptyStackException
	{
		ifEmpty();
		setTop(getTop().getNext());
	}
}
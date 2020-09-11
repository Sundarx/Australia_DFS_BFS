//SUNDAR RAJ

public class GraphNode<T>
{
	private T value;
	private GraphNode<T> firstLink;
	private GraphNode<T> secondLink;
	private GraphNode<T> thirdLink;
	private GraphNode<T> next;
	private boolean visited;

	public GraphNode()
	{
		value = null;
		firstLink = null;
		secondLink = null;
		thirdLink = null;
		next = null;
		visited = false;
	}

	public GraphNode(T val)
	{
		value = val;
		firstLink = null;
		secondLink = null;
		thirdLink = null;
		next = null;
		visited = false;
	}

	public GraphNode(GraphNode<T> node)
	{
		value = node.getValue();
		firstLink = node.getFirstLink();
		secondLink = node.getSecondLink();
		thirdLink = node.getThirdLink();
		visited = node.getVisited();
	}

	public T getValue()
	{
		return value;
	}

	public GraphNode<T> getFirstLink()
	{
		return firstLink;
	}

	public GraphNode<T> getSecondLink()
	{
		return secondLink;
	}

	public GraphNode<T> getThirdLink()
	{
		return thirdLink;
	}

	public GraphNode<T> getNext()
	{
		return next;
	}

	public boolean getVisited()
	{
		return visited;
	}

	public void setValue(T val)
	{
		value = val;
	}

	public void setFirstLink(GraphNode<T> next)
	{
		firstLink = next;
	}

	public void setSecondLink(GraphNode<T> next)
	{
		secondLink = next;
	}

	public void setThirdLink(GraphNode<T> next)
	{
		thirdLink = next;
	}

	public void setNext(GraphNode<T> n)
	{
		next = n;
	}

	public void setVisited(boolean v)
	{
		visited = v;
	}
}
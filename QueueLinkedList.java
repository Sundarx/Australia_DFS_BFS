//SUNDAR RAJ
public class QueueLinkedList<T>
{
	private GraphNode<T> current;
	private GraphNode<T> last;

	public QueueLinkedList()
	{
		current = null;
		last = null;
	}

	public boolean isEmpty()
	{
		return (current == null);
	}

	public boolean isFull()
	{
		return (current == last);
	}

	public void enqueue(GraphNode<T> node)
	{
		GraphNode<T> temp = new GraphNode<T>(node);
		if(last == null)
		{
			current = last = temp;
		}
		else
		{
			last.setNext(temp);
			last = temp;
		}
	}

	public GraphNode<T> dequeue() throws QueueUnderflowException
	{
		if(isEmpty())
		{
			throw new QueueUnderflowException();
		}

		GraphNode<T> temp = current;
		current = current.getNext();

		if(isEmpty())
		{
			last = null;
		}

		return temp;
	}
}
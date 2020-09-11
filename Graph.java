//SUNDAR RAJ
public class Graph
{
	public Graph()
	{
	}

	public GraphNode<String> createGraph()
	{
		GraphNode<String> perth = new GraphNode<String>("Perth");
		GraphNode<String> blackStump = new GraphNode<String>("Black Stump");
		GraphNode<String> darwin = new GraphNode<String>("Darwin");
		GraphNode<String> adelaide = new GraphNode<String>("Adelaide");
		GraphNode<String> melbourne = new GraphNode<String>("Melbourne");
		GraphNode<String> hobart = new GraphNode<String>("Hobart");
		GraphNode<String> canberra = new GraphNode<String>("Canberra");
		GraphNode<String> sydney = new GraphNode<String>("Sydney");
		GraphNode<String> brisbane = new GraphNode<String>("Brisbane");

		perth.setFirstLink(blackStump);

		blackStump.setFirstLink(darwin);

		darwin.setFirstLink(canberra);

		adelaide.setFirstLink(melbourne);
		adelaide.setSecondLink(perth);

		melbourne.setFirstLink(canberra);
		melbourne.setSecondLink(hobart);

		hobart.setFirstLink(melbourne);

		canberra.setFirstLink(brisbane);
		canberra.setSecondLink(sydney);
		canberra.setThirdLink(adelaide);

		sydney.setFirstLink(canberra);
		sydney.setSecondLink(melbourne);

		brisbane.setFirstLink(sydney);

		return sydney;
	}

	private GraphNode<String> getUnvisitedNode(GraphNode<String> source)
	{
		if(source.getFirstLink() != null)
		{
			if(!source.getFirstLink().getVisited())
			{
				return source.getFirstLink();
			}
		}

		if(source.getSecondLink() != null)
		{
			if(!source.getSecondLink().getVisited())
			{
				return source.getSecondLink();
			}
		}

		if(source.getThirdLink() != null)
		{
			if(!source.getThirdLink().getVisited())
			{
				return source.getThirdLink();
			}
		}

		return null;
	}

	public void depthFirstSearch(GraphNode<String> root)
	{
		System.out.println("Depth-First Search:\n");

		StackLinkedList<String> dfs = new StackLinkedList<String>();
		dfs.push(root);
		root.setVisited(true);

		System.out.println(root.getValue());

		while(!dfs.isEmpty())
		{
			GraphNode<String> source = dfs.peek();
			GraphNode<String> destination = getUnvisitedNode(source);
			if(destination != null)
			{
				destination.setVisited(true);
				System.out.println(destination.getValue());
				dfs.push(destination);
			}
			else
			{
				dfs.pop();
			}
		}
	}

	public void breadthFirstSearch(GraphNode<String> root)
	{
		System.out.println("\n\nBreadth-First Search:\n");

		QueueLinkedList<String> bfs = new QueueLinkedList<String>();
		bfs.enqueue(root);
		root.setVisited(true);
		System.out.println(root.getValue());

		while(!bfs.isEmpty())
		{
			GraphNode<String> source = bfs.dequeue();
			GraphNode<String> destination = null;

			while((destination = getUnvisitedNode(source)) != null)
			{
				destination.setVisited(true);
				System.out.println(destination.getValue());
				bfs.enqueue(destination);
			}
		}
	}
}
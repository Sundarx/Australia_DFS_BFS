//SUNDAR RAJ
public class GraphDemo
{
	public static void main(String[] args)
	{
		Graph stack = new Graph();
		GraphNode<String> dfsRoot = stack.createGraph();
		stack.depthFirstSearch(dfsRoot);

		Graph queue = new Graph();
		GraphNode<String> bfsRoot = queue.createGraph();
		queue.breadthFirstSearch(bfsRoot);
	}
}
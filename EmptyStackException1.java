//SUNDAR RAJ
public class EmptyStackException1 extends RuntimeException
{
	public EmptyStackException1()
	{
		super("Error: Stack is empty");
	}

	public EmptyStackException1(String message)
	{
		super(message);
	}
}
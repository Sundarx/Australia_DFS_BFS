//SUNDAR RAJ
public class QueueUnderflowException1 extends RuntimeException
{
	public QueueUnderflowException1()
	{
		super("Error: Queue is empty");
	}

	public QueueUnderflowException1(String msg)
	{
		super(msg);
	}
}
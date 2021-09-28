package myproject;

interface Process1
{
	int code=6565;
	void startup();
}
interface Process2
{
	void shutdown();
}

interface Process3 extends Process1, Process2
{
	void comments();
}

public class Interface_Class1 implements Process3
{
	public static void main(String[] args)
	{
		Process3 obj4=new Interface_Class1();
		Interface_Class1 obj=new Interface_Class1();
		obj.startup();
		obj.shutdown();
		obj.comments();
		obj4.startup();
		obj4.shutdown();
		obj4.comments();
		
		System.out.println("Interface data member:: "+code);
		System.out.println("Interface data member:: "+Process3.code);
	
		if(obj instanceof Process1)
		{
			System.out.println("Yes!Process1");
		}
		if(obj instanceof Process2)
		{
			System.out.println("Yes!Process2");
		}
		if(obj instanceof Process3)
		{
			System.out.println("Yes!Process3");
		}

	}

	@Override
	public void startup() 
	{
		System.out.println("Log files are created!");		
	}

	@Override
	public void shutdown() 
	{
		System.out.println("Log files cleared!");		
	}

	@Override
	public void comments() 
	{
		System.out.println("Server Synchronized and Tuned!");		
	}
}
package assignment1;

public class Saving extends Bank
{
	public static double savRate=0.10;
	public static double bal;
	
	static void calcBalance()
	{
		bal = (int) (curBal + ( savRate * curBal ));
		System.out.println("The CurrentAccount Bal is: "+bal);
	}
}
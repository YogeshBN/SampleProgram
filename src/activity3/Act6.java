package activity3;
import java.util.*;
import java.util.Scanner;
public class Act6 {
	public static void main(String[] args) {
	try
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		      
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("enter the index");
		int p =sc.nextInt();
		System.out.print("the element at particular index "+arr[p]);
		
		String str = sc.next();
		for(int i=0;i<str.length();i++)
			str.charAt(i);
		
		System.out.print("the element at particular index "+str.charAt(p));
		
		String s=sc.next();	
		System.out.print(s.length());
		
		int q = sc.nextInt();
		int w = sc.nextInt();
		System.out.print(q/w);
		
	}
		catch(NegativeArraySizeException e)
	{
		e.printStackTrace();
		System.out.println(e);
	}
		catch(ArrayIndexOutOfBoundsException e)
	{
		e.printStackTrace();
		System.out.println(e);
	}
/*		catch(StringIndexOutOfBoundsException e)
	{
		e.printStackTrace();
		System.out.println(e);
	}*/
		catch(IndexOutOfBoundsException e)
	{
		e.printStackTrace();
		System.out.println(e);
	}
		catch(NullPointerException e) 
	{
		e.printStackTrace();
		System.out.println(e);
	}
		catch(ArithmeticException e)
	{
		e.printStackTrace();
		System.out.println(e);
	}
	}
}